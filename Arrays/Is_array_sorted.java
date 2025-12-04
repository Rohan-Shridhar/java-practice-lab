import java.util.Scanner;
public class Is_array_sorted {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
                System.out.println("Array is not sorted, "+(arr[i])+" comes before "+(arr[i+1]));
                System.exit(0);
            }
        }
        System.out.println("Array is sorted");
    }
}
