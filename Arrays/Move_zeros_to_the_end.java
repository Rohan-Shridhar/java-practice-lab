import java.util.Scanner;
public class Move_zeros_to_the_end {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a==0){
                for(int j=i;j<n-1;j++){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
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
