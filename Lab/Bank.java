import java.util.Scanner;

class Account{
    String cname, accno, atype;
    double balance;

    public Account(String cname, String accno, String atype, double balance) {
        this.cname = cname;
        this.accno = accno;
        this.atype = atype;
        this.balance = balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount of "+amount+"deposited successfully.");
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient balance.");
        }
        else{
            balance-=amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }
    void display(){
        System.out.println("Balance: "+balance);
    }
}
class SavingAccount extends Account{
    double interest = 0.05;
    SavingAccount(String cname, String accno, double balance) {
        super(cname, accno, "Saving", balance);
    }
    void calculate(){
        double interestAmount = (balance * Math.pow(1+interest,1)) - balance;
        super.balance += interestAmount;
        System.out.println("Interest added: "+interestAmount+" in 1 year.");
    }
}

class CurrentAccount extends Account{
    double min = 1000;
    double penalty = 100;
    CurrentAccount(String cname, String accno, double balance) {
        super(cname, accno, "Current", balance);
    }   
    public void checkBalance(){
        if(super.balance < min){
            super.balance -= penalty;
            System.out.println("Penalty imposed: "+penalty);
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter account number:");
        String accno=sc.nextLine();
        System.out.println("Enter initial balance:");
        double balance=sc.nextDouble();
        System.out.println("Enter account type:");
        sc.nextLine();
        String atype=sc.nextLine();
        if(atype.equalsIgnoreCase("Saving")){
            SavingAccount sa=new SavingAccount(name, accno, balance);
            sa.deposit(5000);
            sa.calculate();
            sa.display();
            sa.withdraw(2000);
            sa.display();
        }
        else if(atype.equalsIgnoreCase("Current")){
            CurrentAccount ca=new CurrentAccount(name, accno, balance);
            ca.checkBalance();
            ca.display();
            ca.withdraw(2000);
            ca.display();
        }
        else{
            System.out.println("Invalid account type.");
        }
        sc.close();
    }
}
