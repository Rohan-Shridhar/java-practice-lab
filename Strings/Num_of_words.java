
import java.util.Scanner;

public class Num_of_words {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String ss;
            System.out.println("Enter a sentence");
            ss=sc.nextLine();
            String[] str=ss.split(" ");
            System.out.print(str.length);
    }

    }}
