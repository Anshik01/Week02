import java.util.Scanner;

// definition of Loanable interface
interface Loanable {
    void applyForLoan(float amount);
    boolean calculateLoanEligibility(float amount);
}

// definition of BankAccount class
abstract class BankAccount implements Loanable {
    // declaring the attributes of this class
    protected String accountNumber, holderName;
    protected float  balance=0;

    // defining the behaviour of this class :-

    // created a method to deposit any balance
    protected void deposit(float amount) {
        this.balance += amount;
        System.out.println("Amount Rs." + amount + " Deposited\nCurrent Balance: Rs." + this.balance);
    }

    // created a method to withdraw any balance
    protected void withdraw(float amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient Balance!");
        } else {
            this.balance -= amount;
            System.out.println("Amount Rs." + amount + " Withdrawn from your account\nCurrent Balance: Rs." + this.balance);
        }
    }

    // created an abstract method calculateInterest()
    protected abstract float calculateInterest(float amount);

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String accountNumber, String  holderName, float  balance);

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("this is a BankAccount.");
    }

    // providing definition of method from Loanable interface
    @Override
    public void applyForLoan(float amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("You are eligible for getting loan");
            System.out.println("Your Loan Amount: " + amount + "\nInterest on loan amount will be: " + calculateInterest(amount));
        } else {
            System.out.println("Sorry You Are Not Eligible For Getting Loan!");
        }
    }
}

// definition of SavingsAccount class
class SavingsAccount extends BankAccount {
    // defining the behaviour of this class :-

    // overriding setter method of BankAccount class
    @Override
    public void set(String accountNumber, String  holderName, float  balance) {
        this. holderName =  holderName;
        this.accountNumber = accountNumber;
        this. balance =  balance;
    }

    // creating getter methods
    public String getHolderName() {
        return this.holderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    // overriding the method from Loanable interface
    @Override
    public boolean calculateLoanEligibility(float amount) {
        return amount <= this.balance;
    }

    // overriding the abstract method of BankAccount class
    @Override
    protected float calculateInterest(float amount) {
        return amount * 8 / 100; // 8% interest of amount
    }

    // overriding the displayDetails method of BankAccount class
    @Override
    public void displayDetails() {
        System.out.println("Holder Name: " + this.getHolderName() + "\nAccount Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance());
    }
}

// definition of CurrentAccount class
class CurrentAccount extends BankAccount {
    // defining the behaviour of this class :-

    // overriding setter method of BankAccount class
    @Override
    public void set(String accountNumber, String  holderName, float  balance) {
        this. holderName =  holderName;
        this.accountNumber = accountNumber;
        this. balance =  balance;
    }

    // creating getter methods
    public String getHolderName() {
        return this.holderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    // overriding the method from Loanable interface
    @Override
    public boolean calculateLoanEligibility(float amount) {
        return amount <= this.balance;
    }

    // overriding the abstract method of BankAccount class
    @Override
    protected float calculateInterest(float amount) {
        return amount * 12 / 100; // 12% interest of amount
    }

    // overriding the displayDetails method of BankAccount class
    @Override
    public void displayDetails() {
        System.out.println("Holder Name: " + this.getHolderName() + "\nAccount Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance());
    }
}

// definition of BankingSystem class
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for BankAccount details
        System.out.println("Enter number of Bank Accounts: ");
        int numberOfBankAccounts = sc.nextInt();

        // created an array of references of BankAccount class
        BankAccount [] bankAccounts = new BankAccount[numberOfBankAccounts];

        // iterating through a for loop to get input for the BankAccounts
        for (int i = 0; i < numberOfBankAccounts; i++) {
            // created variables for taking inputs for the attributes of BankAccounts
            System.out.println("Enter  holderName of BankAccount-" + (i+1));
            String  holderName = sc.nextLine();
            holderName = sc.nextLine(); // to avoid conflicts while taking inputs

            System.out.println("Enter Number of BankAccount-" + (i+1));
            String accountNumber = sc.next();

            System.out.println("Enter initial balance of BankAccount-" + (i+1));
            float  balance = sc.nextFloat();

            // initializing objects
            bankAccounts[i] = ( accountNumber.charAt(0) == 'S')? new SavingsAccount() : new CurrentAccount();

            // setting attribute values
            bankAccounts[i].set(accountNumber,  holderName,  balance);
            // getting the details of BankAccount
            bankAccounts[i].displayDetails();
            // applying for loan of 5000 Rs
            bankAccounts[i].applyForLoan(5000);
        }
    }
}