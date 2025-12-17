import CIE.*;
import SEE.*;
import java.util.Scanner;

public class Student_package {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        Personal[] P = new Personal[n];
        Internals[] I = new Internals[n];
        Externals[] E = new Externals[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of student "+(i+1)+":");
            P[i] = new Personal();
            I[i] = new Internals();
            E[i] = new Externals();
            System.out.print("Enter name: ");
            sc.nextLine();
            P[i].name = sc.nextLine();
            System.out.print("Enter USN: ");
            P[i].usn = sc.nextLine();
            System.out.print("Enter semester: ");
            P[i].sem = sc.nextInt();
            System.out.println("Enter internal marks out of 50:");
            for(int j=0;j<5;j++){
                System.out.print("Subject "+(j+1)+": ");
                I[i].marks[j] = sc.nextInt();
            }   
            System.out.println("Enter external marks out of 50:");
            for(int j=0;j<5;j++){
                System.out.print("Subject "+(j+1)+": ");
                E[i].marks[j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of student "+(i+1)+":");
            System.out.println("Name: "+P[i].name);
            System.out.println("USN: "+P[i].usn);
            System.out.println("Semester: "+P[i].sem);
            System.out.println("Total Marks out of 100:");
            for(int j=0;j<5;j++){
                int total = I[i].marks[j] + E[i].marks[j];
                System.out.println("Subject "+(j+1)+": "+total);
            }
            System.out.println();
        }
    }
}
