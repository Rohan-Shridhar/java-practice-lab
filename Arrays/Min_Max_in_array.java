import java.util.Scanner;
public class Min_Max_in_array {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i])
                min=arr[i];
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Minimum= "+min+" and Maximum= "+max);
    }
    }
}
