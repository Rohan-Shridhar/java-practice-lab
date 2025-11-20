public class Patterns {
    public static void main(String[] args) {
        System.out.println("Welcome");
        //Triangle 1
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        //Triangle 2
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //Pyramid code
        int a,b,c,d,e;
        e=35;
        d=(e*2)-1;
        for(a=1;a<=e;a++){
            for(b=1;b<d;b++){
                System.out.print(" ");
            }
            for(c=1;c<=((a*2)-1);c++){
                System.out.print("^");
            }
            d--;
            System.err.println();
        }
    }
}
