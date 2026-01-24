import java.util.Scanner;

public class Lagrange_interpolation {
    private static final Scanner sc=new Scanner(System.in);
    private static final int n=sc.nextInt();
    private static final float[] x=new float[n];
    private static void Get_x(){
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            x[i]=sc.nextFloat();
        }
    }
    private static final float[] y=new float[n];
    private static void Get_y(){
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            y[i]=sc.nextFloat();
        }
    }
    private static final float[] nume=new float[n];
    private static final float[] deno=new float[n];
    private static final float[] L=new float[n];
    private static void Compute_L(float X){
        for(int i=0;i<n;i++){
            nume[i]=1;
            deno[i]=1;
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                nume[i]*=(X-x[j]);
                deno[i]*=(x[i]-x[j]);
            }
            L[i]=nume[i]/deno[i];
        }
    }
    private static float Ans=0;
    private static float Compute_ans(){
        for(int i=0;i<n;i++){
            Ans+=L[i]*y[i];
        }
        return (Ans);
    }
    public static void main(String[] args) {
        System.out.println("Enter x values");
        Get_x();
        System.out.println("Enter y values");
        Get_y();
        System.out.println("Enter interpolating variable");
        float X=sc.nextFloat();
        Compute_L(X);
        System.out.println("Answer is "+Compute_ans());
    }
}
