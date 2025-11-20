//
import java.util.Scanner;

public class Count_alpha_digit_special_char {
    public static void main(String[] args) {
        String str;
        int alpha=0,digit=0,special=0;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enetr a string");
            str=sc.nextLine();
            for(int i=0;i<str.length();i++){
            int a=str.charAt(i);
            char ch=str.charAt(i);
            if(ch==' '){
                continue;
            }
            if(64<a){
                if(91>a){
                    alpha+=1;
                    continue;
                }
                if(96<a){
                    if(123>a){
                        alpha+=1;
                        continue;
                    }
                }
            }
            if(Character.isDigit(ch)){
                digit+=1;
                continue;
            }
            special+=1;
            }
            System.out.println("Alphabets: "+alpha);
            System.out.println("Digits: "+digit);
            System.out.println("Special Characters:"+special);

        }
    }
}
