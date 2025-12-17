import java.util.Scanner;

public abstract class Shape {
    public Scanner sc = new Scanner(System.in);
    public int a;
    public int b;
    abstract void printArea();
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();
        rec.printArea();
        tri.printArea();
        cir.printArea();
    }
}
class Rectangle extends Shape{
    void printArea(){
        System.out.print("Enter length of rectangle: ");
        super.a=sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        super.b=sc.nextInt();
        System.out.println("Area of Rectangle: "+(a*b));
    }
}
class Triangle extends Shape{
    void printArea(){
        System.out.print("Enter base of Triangle: ");
        super.a=sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        super.b=sc.nextInt();
        System.out.println("Area of Triangle: "+(0.5*a*b));
    }
}
class Circle extends Shape{
    void printArea(){
        System.out.print("Enter radius of Circle: ");
        super.a=sc.nextInt();
        System.out.println("Area of Circle: "+(3.14*a*a));
    }
}