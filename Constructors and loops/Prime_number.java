
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number ");
            a=sc.nextInt();
            if(a<1){
                System.out.println("Enter a valid number");
                System.exit(0);
            }
            if(a==1||a==2){
                System.out.println("It is a prime number");
                System.exit(0);
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if(a%i==0){
                    System.out.println("Number is not a prime number ");
                    System.exit(0);
                }
            }
            System.out.println("Number is a prime number ");
        }
    }    
}
