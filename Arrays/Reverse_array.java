import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        int[] temp=new int[n];
        for(int i=0,j=n-1;i<n;i++,j--){
            temp[j]=arr[i];
        }
        System.out.println("Before reversing:");
        for(int i=0;i<n;i++){
        if(i==0){
        System.out.print("[");}
        System.out.print(arr[i]);
        if(i==n-1){
        System.out.println("]");}
        else{
        System.out.print(" , ");}}
        System.arraycopy(temp, 0, arr, 0, n);
        System.out.println("After reverisng:");
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
