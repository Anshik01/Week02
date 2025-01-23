class Company
{
    String companyName;
    //Constructor for the company class
    Company( String companyName)
    {
        this.companyName=companyName;
    }
    Department development = new Department("Devleopment");//Creating the object of the department class
    Department testing = new Department("testing");
    Department hr = new Department("hr");
    //Main method
    public static void main(String[] args)
    {

        Company c = new Company("TCS");


        System.out.println("Company Name: " + c.companyName);
        System.out.println("Department Name: " + c.development.name);
        System.out.println("Employee Name: " + c.development.e1.name);
        System.out.println("Employee Designation: " + c.development.e1.deignation);
        System.out.println("Employee Sallary: " + c.development.e1.Sallary);
        System.out.println("Employee Name: " + c.development.e2.name);
        System.out.println("Employee Designation: " + c.development.e2.deignation);
        System.out.println("Employee Sallary: " + c.development.e2.Sallary);
        System.out.println("Employee Name: " + c.development.e3.name);
        System.out.println("Employee Designation: " + c.development.e3.deignation);
        System.out.println("Employee Sallary: " + c.development.e3.Sallary);
        c=null;
        try{
            System.out.println("Employee Sallary: " + c.development.e1.Sallary);
        }
        catch(NullPointerException e)
        {
            System.out.println("Company does not exist");
            System.out.println("After deleting the object the employee class will also `be deleted");
        }

    }

}
//Department class
class Department
{
    String name;
    //  Constructor for the department class
    Department(String name)
    {
        this.name = name;
    }
    Employee e1 = new Employee("Aryan", "Developer", 10000);
    Employee e2 = new Employee("Abhishek", "Tester", 20000);
    Employee e3 = new Employee("Deepraj", "HR", 30000);
}
// Employee class
class Employee
{
    String name, deignation;
    int Sallary;
    // Constructor for the employee class
    Employee(String name, String deignation, int Sallary)
    {
        this.name = name;
        this.deignation = deignation;
        this.Sallary = Sallary;
    }

}