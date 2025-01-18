// definition of Student class
class Student {
    // declaring the attributes of this class
    public int rollNumber; // public attribute for easy access
    protected String name; // protected attribute for subclass access
    private float CGPA; // private attribute for security

    // created a parameterized constructor to initialize attributes
    Student(int rollNumber, String name, float CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // created a method to access CGPA
    public float getCGPA() {
        return CGPA; // returns the CGPA of the student
    }

    // created a method to modify CGPA
    public void setCGPA(float newCGPA) {
        this.CGPA = newCGPA; // updates the CGPA of the student
    }

    // created a method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// definition of PostgraduateStudent class extending Student class
class PostgraduateStudent extends Student {
    // created a parameterized constructor to initialize attributes for PostgraduateStudent
    PostgraduateStudent(int rollNumber, String name, float CGPA) {
        // calling the constructor of the parent class
        super(rollNumber, name, CGPA);
    }

    // created a method to display a message using the protected member
    public void displayPostgraduateMessage() {
        System.out.println("Postgraduate student " + name + " is enrolled in advanced courses.");
    }
}

// definition of UniversityManagementSystem class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // created an object of Student class
        Student student = new Student(1, "Student-A", 8.0f);

        // displaying student details
        student.displayStudentDetails();

        // updating and displaying the updated CGPA
        student.setCGPA(9.5f);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // displaying student details again after updating CGPA
        student.displayStudentDetails();

        // created an object of PostgraduateStudent class
        PostgraduateStudent postgraduateStudent = new PostgraduateStudent(2, "Student-B", 8.5f);

        // displaying postgraduate student details
        postgraduateStudent.displayStudentDetails();

        // calling method to display postgraduate-specific message
        postgraduateStudent.displayPostgraduateMessage();
    }
}