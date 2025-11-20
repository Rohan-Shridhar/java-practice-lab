
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a string");
            String str=sc.next();
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
            for(int j=0;arr[j]!=0;j++){
                int count=0;
                for(int i=0;i<str.length();i++){
                    if(arr[j]==str.charAt(i)){
                        count+=1;
                    }
                }
                System.out.println(arr[j]+" : "+count);
            }
        }
    }
}
