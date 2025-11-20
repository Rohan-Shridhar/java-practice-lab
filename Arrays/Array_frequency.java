package Arrays.src;
import java.util.Scanner;
public class Array_frequency {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the highest possible element");
        int x=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=(int)(Math.random()*x);}
        boolean flag;
        int[] aar=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                aar[k]=arr[i];
                k++;
            }
        }
        for(int i=0;aar[i]!=0;i++){
            int c=0;
            int a=aar[i];
            for(int b:arr){
                if(a==b){
                    c+=1;
                }
            }
            System.out.println(a+" : "+c);
        }
    }
    }
}
