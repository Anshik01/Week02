// defining parent class
class Person{
    String name;
    int age;

    // parent class constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // method to display role
    void displayRole(){
        System.out.println("Normal Person with name : " + name + " and age : " + age);
    }
}

// child classes
class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name of teacher : " + name);
        System.out.println("Age : " + age);
        System.out.println("Teacher of subject : " + subject);
    }
}

class Student extends Person{
    int grade;

    Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Student of grade : " + grade);
    }
}

class Staff extends Person{
    String department;

    Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Staff of department : " + department);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        // object of Person class
        Person person = new Person("Aayush", 21);
        person.displayRole();
        System.out.println();

        // object of Teacher class
        Teacher teacher = new Teacher("Vishnu Sir", 25, "OOP");
        teacher.displayRole();
        System.out.println();

        // object of Student class
        Student student = new Student("Anshik", 20, 12);
        student.displayRole();
        System.out.println();

        // object of Staff class
        Staff staff = new Staff("Vishal", 22, "IT department");
        staff.displayRole();
        System.out.println();
    }
}
