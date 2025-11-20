package Arrays.src;
import java.util.Scanner;
public class Merge_arrays {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        
        System.out.println("Enter the highest possible element");
        int y=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int m=sc.nextInt();
        int[] brr=new int[m];
        for(int i=0;i<m;i++){
        brr[i]=(int)(Math.random()*y);}
        
        
        int k=0;
        int[] merge=new int[m+n];
        for(int i=0;i<n;i++){
            merge[k]=arr[i];
            k++;        
        }
        for(int i=0;i<m;i++){
            merge[k]=brr[i];
            k++;
        }
        for(int i=0;i<n+m;i++){
        if(i==0){
        System.out.print("[");}
        System.out.print(merge[i]);
        if(i==n+m-1){
        System.out.println("]");}
        else{
        System.out.print(" , ");}}
    }
    }
}
