
public class sample1{
    static int data;
    public static void func(int i) throws ArithmeticException {
        data = 50/i;
        System.out.println(data);
    }
    public static void main(String[] args) {
        try {
            int i=10;
            data = 50 / i;// This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println(data);
            System.out.println("Execution completed.");
        }
        try {
            func(0);  
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Function execution completed.");
        }
    }
}