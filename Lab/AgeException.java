import java.util.Scanner;

class WrongAge extends Exception{
    WrongAge(String message){
        super(message);
    }
}

class Father{
    protected int fatherAge;
    Father(int fatherAge) throws WrongAge{
        if(fatherAge<0){
            throw new WrongAge("Age cannot be negative.");
        }
        this.fatherAge = fatherAge;
    }
    public int getFatherAge(){
        return fatherAge;
    }
}
class Son extends Father{
    private int sonAge;
    Son(int fatherAge, int sonAge) throws WrongAge{
        super(fatherAge);
        if(sonAge<0){
            throw new WrongAge("Age cannot be negative.");
        }
        if(sonAge >= fatherAge){
            throw new WrongAge("Son's age must be less than father's age.");
        }
        this.sonAge = sonAge;
    }
    public int getSonAge(){
        return sonAge;
    }

    public String toString(){
        return "Father's Age: " + fatherAge + ", Son's Age: " + sonAge;
    }
}
public class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter Father's Age: ");
            int fatherAge = sc.nextInt();
            System.out.print("Enter Son's Age: ");
            int sonAge = sc.nextInt();
            Son son = new Son(fatherAge, sonAge);
            System.out.println(son.toString());
        }
        catch(WrongAge e){
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}