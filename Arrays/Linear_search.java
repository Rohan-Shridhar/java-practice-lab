package Arrays.src;
import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        int[] arr=new int[25];
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.println("Enetr the element to be found");
        int a=sc.nextInt();
        boolean flag;
        flag=false;
        int pos=0;
        for(int i=0;i<n;i++){
            if(a==arr[i]){
                flag=true;
                pos=i;
                break;
            }
        }
        System.out.println(a+(flag?(" is found at index "+pos):" is not found"));
    }
    }
}
