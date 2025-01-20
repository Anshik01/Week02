import java.util.Scanner;

class Employee{
    static String companyName = "Capgemini";  // share by all objects of employee
    static int totalEmployees = 0;
    String name;
    final int id;   // id cannot be modified
    String designation;

    Employee(String name, int id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees += 1;
    }

    static void displayTotalEmployee(){
        System.out.println("Total number of employee : " + totalEmployees);
    }

    void printDetails(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Designation : " + designation);
    }

}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String name = sc.nextLine();
        int id = sc.nextInt();
        String designation = sc.nextLine();

        Employee employee = new Employee(name, id, designation);

        if(employee instanceof Employee){
            System.out.println("Company Name : " + Employee.companyName);
            employee.printDetails();
            Employee.displayTotalEmployee();
        }
    }
}
