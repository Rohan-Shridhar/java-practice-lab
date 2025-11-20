
import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number");
            a=sc.nextInt();
            for(int i=1;i<11;i++){
                System.out.println(a+" X "+i+" = "+(a*i));
            }
        }
    }
}
