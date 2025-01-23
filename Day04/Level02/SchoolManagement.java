import java.util.ArrayList;
import java.util.List;

class School
{
    private String name;
    private List<Student> students;

    public School(String name)
    {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public String getName()
    {
        return name;
    }

}

class Student
{
    private String name;
    private List<Course> courses;

    public Student(String name)
    {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course)
    {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course> viewCourses()
    {
        return courses;
    }

    public String getName()
    {
        return name;
    }
}

class Course
{
    private String name;
    private List<Student> students;

    public Course(String name)
    {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public List<Student> viewStudents()
    {
        return students;
    }

    public String getName()
    {
        return name;
    }
}

public class SchoolManagement
{
    public static void main(String[] args) {
        School school = new School("Columbus International School");
        Student student1 = new Student("Aryan");
        Student student2 = new Student("Abhishek");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        System.out.println("Students in " + school.getName() + ":");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Courses of " + student1.getName() + ":");
        for (Course course : student1.viewCourses()) {
            System.out.println(course.getName());
        }

        System.out.println("Students in Math course:");
        for (Student student : course1.viewStudents()) {
            System.out.println(student.getName());
        }
    }
}