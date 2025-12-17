
import java.util.Scanner;

public class Student {
    public static int credits(int marks){
        if(marks>=90){
            return 10;
        }
        else if(marks>=80){
            return 9;
        }
        else if(marks>=70){
            return 8;
        }
        else if(marks>=60){
            return 7;
        }
        else if(marks>=50){
            return 6;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter name and usn");
            String name=sc.nextLine();
            String usn=sc.nextLine();
            
            int creditSum=0;
            int pointSum=0;
            float sgpa;
            
            System.out.print("Enter number of subjects:");
            int sub=sc.nextInt();
            
            int[] marks=new int[sub];
            int[] credit=new int[sub];
            
            for(int i=0;i<sub;i++){
                System.out.print("Enter credits for subject "+(i+1)+" : ");
                credit[i]=sc.nextInt();
                creditSum+=credit[i];
                
                System.out.print("Enter marks for subject "+(i+1)+" : ");
                marks[i]=sc.nextInt();
                pointSum+=credits(marks[i])*credit[i];
            }
            sgpa=(float)pointSum/creditSum;
            System.out.println("Name: "+name);
            System.out.println("USN: "+usn);
            System.out.println("SGPA: "+sgpa);
        }
    }
}
