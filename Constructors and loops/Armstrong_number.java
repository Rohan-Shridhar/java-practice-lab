
import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number");
            a=sc.nextInt();
            int sum=0,temp=a,digit;
            String str=String.valueOf(a);
            do { 
                digit=temp%10;
                temp/=10;
                sum+=Math.pow(digit, str.length());
            } while (temp>0);
            System.out.println("Its is "+(sum==a?"":"not ")+"an Armstrong number");
        }
    }
}
