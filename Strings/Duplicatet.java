
import java.util.Scanner;

public class Duplicatet {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String str;
            System.out.println("Enter the string");
            str=sc.next();
            char[] arr=new char[100];
            int k=0;
            boolean flag;
            for(int i=0;i<str.length();i++){
                flag=false;
                for(char ch:arr){
                    if(ch==str.charAt(i)){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                    arr[k]=str.charAt(i);
                    k++;
                }
            }
            String rts=new String(arr);
            System.out.println("String after removing duplicate characters is "+rts);
        }
    }
}
