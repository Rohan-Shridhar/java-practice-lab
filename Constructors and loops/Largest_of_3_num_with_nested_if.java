
import java.util.Scanner;

public class Largest_of_3_num_with_nested_if {
    public static void main(String[] args) {
        int a,b,c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the three numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if (a>b) {
                if(a>c){
                    System.out.println(a+" is the largest");
                }
                else{
                    System.out.println(c+" is the largest");
                }
            } else {
                if(b>c){
                    System.out.println(b+" is the largest");
                }
                else{
                    System.out.println(c+" is the largest");
                }
            }
        }
    }
}
