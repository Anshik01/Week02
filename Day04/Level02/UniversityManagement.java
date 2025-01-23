import java.util.*;
public class UniversityManagement {
    public static void main(String[] args) {
        // Example usage
        Student1 student = new Student1("Anshik Jaiswal", "211033");
        Professor professor = new Professor("Nischal Kaushal", "Training and Placement");
        Course1 course = new Course1("AL-801", "Business Intellegence");

        student.enrollCourse(course);
        professor.assignCourse(course);

        System.out.println(student);
        System.out.println(professor);
        System.out.println(course);
    }
}

class Student1 {
    private String name;
    private String studentId;
    private Course1 course;

    public Student1(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void enrollCourse(Course1 course) {
        this.course = course;
        course.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student name = " + name + " ,  Student studentId = " + studentId + " , Student course = " + course.getCourseName() ;
    }
}

class Professor {
    String name;
    String department;
    Course1 course;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void assignCourse(Course1 course) {
        this.course = course;
        course.setProfessor(this);
    }

    @Override
    public String toString() {
        return "Professor name = " + name + " , Professor department = " + department + " , Professor's course = " + course.getCourseName() ;
    }
}

class Course1 {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private List<Student1> students;

    public Course1(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student1 student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course Code = " + courseCode + " , Course Name = " + courseName + " , Professor = " + professor.name + ", Students = " + students.size() ;
    }
}