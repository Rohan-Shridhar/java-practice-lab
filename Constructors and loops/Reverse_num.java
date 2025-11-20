
import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a;
            System.out.println("Enter the number");
            a=sc.nextInt();
            int rev=0,digit,temp=a;
            do { 
                digit=temp%10;
                rev=digit+(rev*10);
                temp/=10;
            } while (temp>0);
            System.out.print(rev);
        }
    }
}
