
import java.util.Scanner;

public class Even_num_from_n_to_m {
    public static void main(String[] args) {
        int n,m;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the values of n and m");
            n=sc.nextInt();
            m=sc.nextInt();
            for(int i=(n>m?m:n);i<=(n>m?n:m);i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
