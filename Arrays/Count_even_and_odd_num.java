package Arrays.src;
import java.util.Scanner;
public class Count_even_and_odd_num {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                e+=1;
            }
            else{
                o+=1;
            }
        }
        System.out.println("There are "+e+" even numbers and "+o+" odd numbers in this array");
    }
    }
}
