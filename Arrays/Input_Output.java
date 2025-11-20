package Arrays.src;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[] arr=new int[100];
            System.out.println("Enetr the number of elements");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+"\t");
            }
        }
    }
}
