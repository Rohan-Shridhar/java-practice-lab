
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String str,rts;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the strings");
            str=(sc.next().trim()).toLowerCase();
            rts=(sc.next().trim()).toLowerCase();
            if(str.length()!=rts.length()){
                System.err.println("Invalid input");
                System.exit(0);
            }
            boolean flag = false;
            for(int i=0;i<str.length();i++){
                for(int j=0;j<rts.length();j++){
                    flag=false;
                    if(str.charAt(i)==rts.charAt(j)){
                        flag=true;
                        break;
                    }
                } 
                if(flag==false)                            
                break;
            }
            System.out.println(str+" and "+rts+" "+(flag?"are":"aren't")+" anagrams");
        }
    }
}
