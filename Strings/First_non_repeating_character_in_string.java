
import java.util.Scanner;

public class First_non_repeating_character_in_string {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str;
            System.out.println("Enetr a string");
            str=sc.next().toLowerCase();
            boolean flag;
            char[] arr=new char[str.length()+1];
            for(int i=0;i<str.length();i++){
                arr[i]=str.charAt(i);
            }
            for(int i=0;i<str.length();i++){
                flag=true;
                char ch=arr[i];
                for(int j=i+1;j<str.length();j++){
                    if(ch==arr[j]){
                        flag=false;
                    }
                }
                if(flag==true){
                    System.out.println(ch+" is the first non repeating character in "+str);
                    System.exit(0);
                }
            }
            System.out.println("All characters arer repeating in "+str);
            }
        }
    }

