
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str,strog;
            System.out.println("Enetr the string");
            strog=sc.nextLine();
            str=strog.toLowerCase();
            boolean flag;
            flag=true;
            char[] arr=new char[str.length()];
            for(int i=0;i<str.length();i++){
                arr[i]=str.charAt(i);
            }
            for(int i=0,j=str.length()-1;i<str.length();i++,j--){
                if(arr[j]!=str.charAt(i)){
                    flag=false;
                    break;
                }
            }
            System.out.println(strog+(flag?" is":" isn't")+" a pallindrome");
        }
    }
}
