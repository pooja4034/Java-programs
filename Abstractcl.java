import java.util.Scanner;
abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Enter legth and breadth");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Rectangle is " + l * b);
    }
}

class Triangle extends Shape {
    public void area() {
        System.out.println("Enter legth and breadth");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of Triangle is " + (0.5 * l * b));
    }
}

public class Abstractcl {
    public static void main(String args[]) {
        Rectangle R = new Rectangle();
        R.area();
        Triangle T = new Triangle();
        T.area();
    }
}