import java.util.ArrayList;
import java.util.List;

class Subject // Subject class with name and marks
{
    private String name;
    private int marks;

    public Subject(String name, int marks) // Constructor
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() // Getter methods
    {
        return name;
    }

    public int getMarks() // Getter methods
    {
        return marks;
    }
}

class Student // Student class with name and subjects list
{
    private String name;
    private List<Subject> subjects;

    public Student(String name) // Constructor
    {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject)// Method to add subject to the list
    {
        subjects.add(subject);
    }

    public String getName() // Getter method
    {
        return name;
    }

    public List<Subject> getSubjects()
    {
        return subjects;
    }
}

class GradeCalculator // GradeCalculator class with calculateGrade method
{
    public static String calculateGrade(Student student)// calculateGrade method to calculate grade based on average marks
    {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        for (Subject subject : student.getSubjects())// Loop to calculate total marks
        {
            totalMarks += subject.getMarks();
        }

        double average = (double) totalMarks / subjectCount;

        if (average >= 90)
        {
            return "A";
        } else if (average >= 80)
        {
            return "B";
        } else if (average >= 70)
        {
            return "C";
        } else if (average >= 60)
        {
            return "D";
        } else
        {
            return "F";
        }
    }
}

public class SchoolResultApplication// SchoolResultApplication class with main method
{
    public static void main(String[] args) // Main method
    {
        Student student = new Student("Anshik Jaiswal");
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        String grade = GradeCalculator.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}