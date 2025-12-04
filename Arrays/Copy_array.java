import java.util.Scanner;
public class Copy_array {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        int[] brr=new int[n];
        System.arraycopy(arr, 0, brr, 0, n);
        System.out.println("Copied array is:");
        for(int i=0;i<n;i++){
        if(i==0){
        System.out.print("[");}
        System.out.print(arr[i]);
        if(i==n-1){
        System.out.println("]");}
        else{
        System.out.print(" , ");}}
    }
    }
}
