
import java.util.Scanner;

public class Fcatorial {
    public static void main(String[] args) {
        int a;
        int fact;
        fact=1;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a number");
            a=sc.nextInt();
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            System.out.println(a+"!="+fact);
        }
    }
}
