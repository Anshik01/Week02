import java.util.Scanner;

class BankAccount{
    String accountHolder;
    long accountNumber;
    int balance;
    public BankAccount(String accountHolder, long accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to withdraw money
    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Balance.");
            return;
        }

        balance -= amount;
        System.out.println("Withdraw option is completed");
        System.out.println("Curent balance : " + balance);
    }

    // method to deposit money
    public void deposit(int amount){
        balance += amount;

        System.out.println("Amount has been deposited");
        System.out.println("Current balance : " + balance);
    }

    // method to print current balance
    public void checkBalance(){
        System.out.println("Current balance : " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input data from user
        String name = sc.nextLine();
        long accountNumber = sc.nextLong();
        int balance = sc.nextInt();

        // input user want to perform
        System.out.println("Enter the operation you want to perform");
        String operation = sc.next();

        // initializing the object
        BankAccount bankAccount = new BankAccount(name, accountNumber, balance);

        // checking which operation to perform
        switch (operation) {
            case "withdraw" -> {
                System.out.println("Enter amount : ");
                int amount = sc.nextInt();
                bankAccount.withdraw(amount);
            }
            case "deposit" -> {
                System.out.println("Enter amount : ");
                int amount = sc.nextInt();
                bankAccount.deposit(amount);
            }
            case "checkBalance" -> bankAccount.checkBalance();

            // print operation is invalid
            default -> System.out.println("Invalid operation");
        }
    }
}
