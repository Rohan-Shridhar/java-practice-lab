

import java.util.Scanner;

public class Newton_forward_interpolation {
    public static Scanner sc=new Scanner(System.in);
    private static int n=sc.nextInt();
    private static final float[] arr=new float[n];
    private static void get_arr(){
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextFloat();}
    }
    private static final float[] brr=new float[n];
    private static void get_brr(){
        System.out.println("Enter the elemnts");
        for(int i=0;i<n;i++){ 
            //brr[i]=(float)Math.sin(arr[i]*(Math.PI/180));  
            //System.out.println(brr[i]);
            brr[i]=sc.nextFloat();
        }
    }
    private static float p;
    private static void Compute_p(float X){
        float x=arr[0];
        float h=arr[1]-arr[0];
         p=(X-x)/h;
    }
    private static final float[][] delta=new float[n][n];
    private static void Compute_delta(){
        System.arraycopy(brr, 0, delta[0], 0, n);
        for(int i=1;i<n;i++){
            for(int k=0;k<n-i;k++){
                delta[i][k]=delta[i-1][k+1]-delta[i-1][k];
            }
        }
    }
    private static final float[] delta_y=new float[n];
    private static void Array_delta(){
        for(int i=0;i<n;i++){
            if(delta[i][0]==0 && delta[i][1]==0){
                break;
            }
            delta_y[i]=delta[i][0];
        }
        n=delta_y.length;
    }
    private static final float[] poly=new float[n];
    private static void Array_p(){
        poly[0]=1;
        poly[1]=p;
        for(int i=2;i<n;i++){
            poly[i]=p;
            for(int j=1;j<i;j++){
                poly[i]*=(p-j);
            }
        }
    }
    private static final float[] fact=new float[n];
    private static void Array_fact(){
        for(int i=0;i<n;i++){
            fact[i]=1;
            for(int j=2;j<=i;j++){
                fact[i]*=j;
            }
        }
    }
    private static final float[] ans=new float[n];
    private static void Array_ans(){
        for(int i=0;i<n;i++){
            ans[i]=(poly[i]*delta_y[i])/(fact[i]);
        }
    }
    private static float Answer=0F;
    private static float Compute_ans(){
        Answer=0;
        for(int i=0;i<n;i++){
            Answer+=ans[i];
        }
        return Answer;
    }
    public static void main(String[] args) {
        System.out.println("Enter the values of x:");
        get_arr();
        System.out.println("Enter the values of y:");
        get_brr();
        System.out.println("Number of interpolating variables");
        int x=sc.nextInt();
        for(int i=0;i<x;i++){// You cab control this for finding answers of more than 1 interpolating variables
        System.out.println("Enter the interpolating variable X:");
        float X=sc.nextFloat();
        Compute_p(X);
        Compute_delta();
        Array_delta();
        Array_p();
        Array_fact();
        Array_ans();
        float Ans=Compute_ans();
        System.out.println("Answer is f("+X+")= "+Ans);}
    }
}
