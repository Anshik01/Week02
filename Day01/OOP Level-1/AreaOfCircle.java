import java.util.Scanner;

class Circle{
    double radius;

    // contructor to initialize radius
    public Circle(double radius){
        this.radius = radius;
    }

    // Method to print area of circle
    public void printArea(){
        // area of circle = pi * radius * radius
        System.out.println("Area of circle : " + Math.PI * radius * radius);
    }
}
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        // input radius
        double radius = sc.nextDouble();

        // creating instance of a class using object
        Circle circle = new Circle(radius);
        // calling printArea function from class Circle
        circle.printArea();

    }
}
