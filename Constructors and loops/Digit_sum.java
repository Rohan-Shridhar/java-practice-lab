
import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number ");
            a=sc.nextInt();
            int sum=0,digit;
            do { 
                digit=a%10;
                a/=10;
                sum+=digit;
            } while (a>0);
            System.out.println("Sum= "+sum);
        }
    }
}
