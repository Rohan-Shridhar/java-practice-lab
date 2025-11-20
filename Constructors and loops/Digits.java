
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number");
            a=sc.nextInt();
            String str=String.valueOf(a);
            int[] d=new int[str.length()];
            int k=0;
            {
                do { 
                    d[k]=a%10;
                    a=a/10;    
                    k++;           
                } while (a>0);
            }
            for(int i=k-1;i>=0;i--)
            System.out.print(d[i]+" ");
        }
    }
}
