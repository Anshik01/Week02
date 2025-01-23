import java.util.ArrayList;
// Bank class
public class Bank
{
    private ArrayList<Customer> accounts = new ArrayList<Customer>();
    // Constructor For the bank class
    Bank()
    {
        this.accounts = new ArrayList<Customer>();// Creating a new array list of customer type
    }
    public void add(Customer c)
    {
        accounts.add(c);
    }
    public static void main(String[] args)
    {
        Bank b=new Bank();
        Customer c1=new Customer("Aryan", 1234, 1000);
        Customer c2=new Customer("Abhishek", 1235, 2000);
        Customer c3=new Customer("Deepraj", 1236, 3000);
        b.accounts.add(c1);
        b.accounts.add(c2);
        b.accounts.add(c3);
        // Displaying the balance of the customers
        for(Customer c:b.accounts)
        {
            c.displayBalance();
        }
        c1.addBalance(20000);
        c1.withdrawBalance(412421);
        c1.withdrawBalance(900);
    }
}
// Customer class
class Customer
{
    private String name;
    private int AccountNumber;
    private float balance;
    // Constructor for the customer class
    Customer(String name, int AccountNumber, float balance)
    {
        this.name = name;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }
    // Method to display the balance
    void displayBalance()
    {
        System.out.println("Name: " + name + " Account Number: " + AccountNumber + " Balance: " + balance);
    }
    //Method to add the balance
    void addBalance(float amount)
    {
        balance += amount;
        System.out.println("Amount added successfully and the updated balance is: " + balance);
    }
    //Method to withdraw the balance
    void withdrawBalance(float amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            System.out.println("Amount withdrawn successfully and the updated balance is: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

}