import java.util.Scanner;
public class Prime_num_1_to_n {
        public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            boolean flag;
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Prime numbers between 1 and "+n+" are:");
        for(int i=2;i<n;i++){
            flag=true;
            for(int  j=2;j<((int)(Math.sqrt(i)))+1;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }}
                if(flag){
                    System.out.print(i+" ");
                }
            
        
        }
        }
    }
}
