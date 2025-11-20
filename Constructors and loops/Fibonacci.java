
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number");
            a=sc.nextInt();
            int n1,n2,n3;
            n1=0;
            n2=1;
            for(int i=0;i<a-2;i++){
                if(i==0){
                    System.out.print(0+" ");
                }
                if(i==1){
                    System.out.print(1+" ");
                }
                n3=n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
        }
    }
}
