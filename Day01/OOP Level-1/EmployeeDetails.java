import java.util.Scanner;

// employee class to store the dtails of employee
class Emp{
	String name;
	int id;
	int salary;
	
	// method to display employee detail
	public void printDetails(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
		
		System.out.println("Employee name : " + name);
		System.out.println("Employee id : " + id);
		System.out.println("Employee salary : " + salary);
	}
}

public class EmployeeDetails{
	public static void main(String[]args){
		
			Scanner sc = new Scanner(System.in);
			
			// taking inputs
			String name = sc.next();
			int id = sc.nextInt();
			int salary = sc.nextInt();
			
			// initializing the class using object
			Emp em = new Emp();
			
			// calling printDetails function from class employee detail
			em.printDetails(name, id, salary);
		
	}
}