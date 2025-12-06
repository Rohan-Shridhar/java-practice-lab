import java.util.Scanner;
public class Remove_duplicates {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}

        for(int i=0;i<n;i++){
        if(i==0){
        System.out.print("[");}
        System.out.print(arr[i]);
        if(i==n-1){
        System.out.println("]");}
        else{
        System.out.print(" , ");}}

        boolean flag;
        int[] aar=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                aar[k]=arr[i];
                k++;
            }
        }
        System.out.println("Array with unigue elements is: ");
        for(int i=0;i<k;i++){
        if(i==0){
        System.out.print("[");}
        System.out.print(aar[i]);
        if(i==k-1){
        System.out.println("]");}
        else{
        System.out.print(" , ");}}
    }
    }
}
