
import java.util.Scanner;
public class Average_of_elements {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        int s=0;
        float avg;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        avg=(float)s/n;
        System.out.println("Average of elemnts is "+avg);
    }
    }
}
