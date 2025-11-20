
import java.util.Scanner;

public class Pallindrome_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a;
            int[] abc=new int[10];
            int[] cba=new int[10];
            boolean flag=true;
            System.out.println("Enter the number");
            a=sc.nextInt();
            if(a>0&&a<10){
                System.out.println("Why do you think of single digits as pallindromes \\(^^)/");
                System.exit(0);
            }
            int k=-1;
            do { 
                k++;
                abc[k]=a%10;
                a=a/10;
            } while (a>0);
            for(int i=0,j=k;i<k+1;i++,j--){
                cba[i]=abc[j];
            }
            for(int i=0;i<k+1;i++){
                if(abc[i]!=cba[i]){
                    flag=false;
                    break;
                }
            }
            System.out.print("It is "+(flag?"":"not ")+"a pallindrome");
        }
    }
}
