package Arrays.src;
import java.util.Scanner;
public class Rotate_array {
    public static Scanner sc = new Scanner(System.in);
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the number of rotations:");
        int r = sc.nextInt();   
        int[] temp = new int[r];
        System.arraycopy(arr, 0, temp, 0, r);
        for(int i=0;i<r;i++){
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
        }
        for(int i=0;i<r;i++){
            arr[n-r+i]=temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
