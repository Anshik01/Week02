// definition of BankAccount class
class BankAccount {
    // declaring the attributes of this class
    public int accountNumber; // public attribute for easy access
    protected String accountHolder; // protected attribute for subclass access
    private double balance; // private attribute for security

    // created a parameterized constructor to initialize attributes
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // created a method to get the current balance
    public double getBalance() {
        return balance; // returns the current balance
    }

    // created a method to modify the balance
    public void updateBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount; // updates the balance if the amount is valid
        } else {
            System.out.println("Invalid balance amount. Please provide a non-negative value.");
        }
    }

    // created a method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

// definition of SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {
    // additional attribute for SavingsAccount
    private double interestRate; // private attribute to store interest rate

    // created a parameterized constructor to initialize attributes for SavingsAccount
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        // calling the constructor of the parent class
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // created a method to display SavingsAccount-specific details
    public void displaySavingsAccountDetails() {
        // accessing accountNumber (public) and accountHolder (protected) directly
        System.out.println("Savings Account - Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }
}

// definition of BankAccountManagement class
public class BankAccountManagement {
    public static void main(String[] args) {
        // created an object of BankAccount class
        BankAccount account = new BankAccount(1, "Person-A", 5000.0);

        // displaying account details
        account.displayAccountDetails();

        // updating the balance and displaying the updated details
        account.updateBalance(5500.0);
        System.out.println("Updated Balance: " + account.getBalance());

        // displaying account details after updating the balance
        account.displayAccountDetails();

        // created an object of SavingsAccount class
        SavingsAccount savingsAccount = new SavingsAccount(2, "Person-B", 10000.0, 2.5);

        // displaying savings account-specific details
        savingsAccount.displaySavingsAccountDetails();
    }
}
