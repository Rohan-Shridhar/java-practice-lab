
import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to find if it is positive negative or 0");
            a=sc.nextInt();
            if(a>0)
                System.out.println("Positive");
            else if(a<0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }
    }
}
