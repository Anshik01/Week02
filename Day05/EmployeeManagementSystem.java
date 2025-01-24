// defining the base class
class Employee{
    // General attributes
    String name;
    int id;
    int salary;

    // Constructor of Employee class
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name of the employee : " + name);
        System.out.println("ID of the employee : " + id);
        System.out.println("Salary of employee : " + salary);
    }
}

// Manager class extending properties from employee
class Manager extends Employee{
    // unique property teamsize
    int teamSize;
    Manager(String name, int id, int salary, int teamsize){
        super(name, id, salary);
        this.teamSize = teamsize;
    }

    // Overridden method
    @Override
    void displayDetails(){
        System.out.println("Name of the Manager : " + name);
        System.out.println("ID of the Manager : " + id);
        System.out.println("Salary of Manager : " + salary);
        System.out.println("Team size : " + teamSize);
    }
}

// Developer class extending properties from employee
class Developer extends Employee{
    // unique property programming language
    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method
    @Override
    void displayDetails(){
        System.out.println("Name of the Developer : " + name);
        System.out.println("ID of the Developer : " + id);
        System.out.println("Salary of Developer : " + salary);
        System.out.println("Programming language : " + programmingLanguage);
    }
}

// Intern class extending properties from employee
class Intern extends Employee{
    // unique property internship period
    int internshipPeriod;

    Intern(String name, int id, int salary, int internshipPeriod){
        super(name, id, salary);
        this.internshipPeriod = internshipPeriod;
    }

    // Overridden method
    @Override
    void displayDetails(){
        System.out.println("Name of the Developer : " + name);
        System.out.println("ID of the Developer : " + id);
        System.out.println("Salary of Developer : " + salary);
        System.out.println("Internship Period : " + internshipPeriod);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Object of base class
        Employee employee = new Employee("Aakash", 101, 20000);
        employee.displayDetails();

        // Object of manager class
        Manager manager = new Manager("Aayush", 102, 25000, 15);
        manager.displayDetails();

        // Object of Developer class
        Developer developer = new Developer("Anshik", 103, 800000, "Java");
        developer.displayDetails();

        // Object of Intern class
        Intern intern = new Intern("Durgesh", 104, 10000, 6);
        intern.displayDetails();

    }
}
