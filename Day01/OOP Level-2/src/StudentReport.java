import java.util.Scanner;

class Student{
    String name;
    String rollNumber;

    // constructor to initialize attributes
    public Student(String name, String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // method to calculae grade
    public char calculateGrades(int m1, int m2, int m3){
        double percent = (double) (m1+ m2+ m3) / 300.0 * 100.0;

        if(percent >= 90.0){
            return 'A';
        }
        else if(percent >= 75.0){
            return 'B';
        }
        else if(percent >= 60){
            return 'C';
        }
        else if(percent >= 33.0){
            return 'D';
        }
        else{
            return 'F';
        }

    }

    // method to display student details
    public void displayDetails(char grade){
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + rollNumber);
        System.out.println("Grade : " + grade);
    }

}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input data
        String name = sc.next();
        String rollnumber = sc.next();
        int mathMarks = sc.nextInt();
        int physicsMarks = sc.nextInt();
        int chemistyMarks = sc.nextInt();

        // initialize class using object
        Student student = new Student(name, rollnumber);

        // calculating rade of student
        char grade = student.calculateGrades(mathMarks, physicsMarks, chemistyMarks);

        // display student details
        student.displayDetails(grade);

    }
}