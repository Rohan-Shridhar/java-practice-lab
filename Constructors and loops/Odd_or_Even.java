
import java.util.Scanner;

public class Odd_or_Even{
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if odd or even");
            a=sc.nextInt();
            if (a%2==0) {
                System.out.println("Number is even");
                System.exit(0);
            }
            System.out.println("Number is odd");
        }
    }
}