import java.util.Scanner;

class Student{
    static String universityName = "RGPV";   //  university name does not depend on object
    static int totalStudent = 0;
    String name;
    final String rollNumber;   // rollNumber is unique
    char grade;

    static void displayTotalStudents(){
        System.out.println("Total number of student : " + totalStudent);
    }

    public Student(String name, String rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent += 1;
    }

    public void displayDetails(){
        System.out.println("Student name : " + name);
        System.out.println("RollNumber : " + rollNumber);
        System.out.println("Grade : " + grade);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String name = sc.nextLine();
        String rollNumber = sc.next();
        char grade = sc.next().charAt(0);

        // create object of class Student
        Student student = new Student(name, rollNumber, grade);

        // check if student is instance of class
        if(student instanceof Student){
            System.out.println(Student.universityName);
            student.displayDetails();
            Student.displayTotalStudents();
        }
    }
}
