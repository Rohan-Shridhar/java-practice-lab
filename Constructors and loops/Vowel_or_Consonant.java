
import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args){
        String ch;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a charater");
            ch=sc.next();
            switch(ch.toLowerCase()){
                case "a" -> System.out.println("Vowel");
                case "e" -> System.out.println("Vowel");
                case "i" -> System.out.println("Vowel");
                case "o" -> System.out.println("Vowel");
                case "u" -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }
    }
}
