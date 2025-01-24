// Implementing Hierarchical  Inheritance

// Defining Parent class
class BankAccount{
    String accountNumber;
    int balance;

    // parent class constructor
    BankAccount(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to display account details
    void displayAccountType(){
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}

// child class
class SavingAccount extends BankAccount{
    double interest;   // unique attribute

    SavingAccount(String accountNumber, int balance, double interest){
        // invoke parent constructor using super
        super(accountNumber, balance);
        this.interest = interest;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Saving Account");
        super.displayAccountType();
        System.out.println("Interest : " + interest);
    }
}

class CheckingAccount extends BankAccount{
    int withdrawalLimit;

    CheckingAccount(String accountNumber, int balance, int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Checking Account");
        super.displayAccountType();
        System.out.println("WithdrawalLimit : " + withdrawalLimit);
    }
}

class FixedDepositAmount extends BankAccount{
    String renewalDate;

    FixedDepositAmount(String accountNumber, int balance, String renewalDate){
        super(accountNumber, balance);
        this.renewalDate = renewalDate;
    }

    // Overridden Method
    @Override
    void displayAccountType(){
        System.out.println("Account Type is Fixed Deposit Account");
        super.displayAccountType();
        System.out.println("Renewal Date : " + renewalDate);
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        // Object of BackAccount class
        BankAccount bankAccount = new BankAccount("2541698702", 50000);
        bankAccount.displayAccountType();
        System.out.println();

        // Object of SavingAccount class
        SavingAccount savingAccount = new SavingAccount("2541698702", 50000, 5.6);
        savingAccount.displayAccountType();
        System.out.println();

        // Object of CheckingAccount class
        CheckingAccount checkingAccount = new CheckingAccount("2541698702", 50000, 10000);
        checkingAccount.displayAccountType();
        System.out.println();

        // Object of FixedDepositAmount class
        FixedDepositAmount fixedDepositAmount = new FixedDepositAmount("2541698702", 50000, "25-09-2025");
        fixedDepositAmount.displayAccountType();
        System.out.println();
    }
}
