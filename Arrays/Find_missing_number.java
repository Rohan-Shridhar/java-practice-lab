package Arrays.src;
import java.util.Scanner;
public class Find_missing_number {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}

        for(int i=1;i<arr.length+1;i++){
            boolean flag=false;
            for(int j:arr){
                if(i==j){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i+" is not in the array");
                System.exit(0);
            }
        }
        System.out.print("All numbers are present");
    }
    }
}
