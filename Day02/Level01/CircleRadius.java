import java.util.Scanner;

class Circle{
    double radius;
    public Circle(){
        // constructor chaining within the same class
        this(0.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }

    // method to print radius
    public void printRadius(){
        System.out.println("Radius of circle : " + radius);
    }
}

public class CircleRadius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input radius
        double radius = sc.nextDouble();

        // creating an object using non-parameterized constructor
        Circle ansWithoutParameters = new Circle();

        // creating an object using parameterized constructor
        Circle ansWithParameters = new Circle(radius);

        // print output using parameterized constructor
        ansWithParameters.printRadius();

        // print output using non-parameterized constructor
        ansWithoutParameters.printRadius();
    }
}
