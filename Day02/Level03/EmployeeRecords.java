// definition of Employee class
class Employee {
    // declaring the attributes of this class
    public int employeeID; // public attribute for easy access
    protected String department; // protected attribute for subclass access
    private double salary; // private attribute for security

    // created a parameterized constructor to initialize attributes
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // created a method to modify the salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary; // updates the salary if the amount is valid
        } else {
            System.out.println("Invalid salary amount. Salary must be greater than zero.");
        }
    }

    // created a method to get the salary
    public double getSalary() {
        return salary; // returns the current salary
    }

    // created a method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// definition of Manager class extending Employee class
class Manager extends Employee {
    // additional attribute for Manager
    private int teamSize; // private attribute to store the size of the manager's team

    // created a parameterized constructor to initialize attributes for Manager
    Manager(int employeeID, String department, double salary, int teamSize) {
        // calling the constructor of the parent class
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // created a method to display Manager-specific details
    public void displayManagerDetails() {
        // accessing employeeID (public) and department (protected) directly
        System.out.println("Manager Details - Employee ID: " + employeeID + ", Department: " + department + ", Team Size: " + teamSize);
    }
}

// definition of EmployeeRecords class
public class EmployeeRecords {
    public static void main(String[] args) {
        // created an object of Employee class
        Employee employee = new Employee(1, "Department-A", 1000.0);

        // displaying employee details
        employee.displayEmployeeDetails();

        // updating and displaying the updated salary
        employee.setSalary(1500.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        // displaying employee details after updating the salary
        employee.displayEmployeeDetails();

        // created an object of Manager class
        Manager manager = new Manager(2, "Department-B", 2000.0, 10);

        // displaying manager-specific details
        manager.displayManagerDetails();
    }
}
