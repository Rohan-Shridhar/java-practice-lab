
import java.util.Scanner;

public class Leap_year{
    public static void main(String[] args) {
        int y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year");
            y=sc.nextInt();
            if((y%4==0 && y%100!=0)||(y%400==0)){
                System.out.println("Leap Year");
                sc.close();
                System.exit(0);
            }
            System.out.println("Not a Leap Year");
        }
    }
}