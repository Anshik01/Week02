// defining an abstract method
abstract class Employee{
    int empID;
    String name;
    private float baseSalary;

    // getter method to access private variable
    public float getSalary(){
        return baseSalary;
    }

    // setter method to set private variable
    public void setter(int salary){
        baseSalary = salary;
    }

    // constructor
    Employee(int empID, String name, float baseSalary){
        this.empID = empID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // declaring an abstract method
    abstract float calculateSalary();

    void displayDetails(){
        System.out.println("Employee ID : " + empID);
        System.out.println("Employee name : " + name);
        System.out.println("Base salary : " + baseSalary);
    }
}

interface Department{

    // assign department
    void assignDepartment();

    // get department
    String getDepartmentDetail();
}
class FullTimeEmployee extends Employee implements Department{

    String department;

    FullTimeEmployee(int empId, String name, float baseSalary){
        // invoke parent class constructor
        super(empId, name, baseSalary);
        assignDepartment();
    }

    @Override
    public float calculateSalary(){
        // reducing 8% from base salary to form in-hand salary
        return getSalary() - (float)(getSalary() * 8 /100);
    }


    @Override
    public void assignDepartment() {
        department = "Full time Employee";
    }

    @Override
    public String getDepartmentDetail() {
        return department;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department : " + getDepartmentDetail());
        System.out.println("Inhand Salary : " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Department{

    String department;
    PartTimeEmployee(int empId, String name, float baseSalary){
        super(empId, name, baseSalary);
        assignDepartment();   // assigning value of department in the constructor
    }

    @Override
    public float calculateSalary(){
        // reducing 8% from base salary to form in-hand salary
        return getSalary() - (float)(getSalary() * 8 /100);
    }


    @Override
    public void assignDepartment() {
        department = "Part time Employee";   // assigning value to department
    }

    @Override
    public String getDepartmentDetail() {
        return department;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department : " + getDepartmentDetail());
        System.out.println("Inhand Salary : " + calculateSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // creating object of Fulltime employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Anshik", 15000);
        // creating object of Parttime employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Aayush", 5000);

        // array to store all employee
        Employee[] emp = new Employee[2];

        emp[0] = fullTimeEmployee;
        emp[1] = partTimeEmployee;

        // calling display method
        emp[0].displayDetails();
        System.out.println();
        emp[1].displayDetails();

    }
}
