import java.util.Scanner;

// creating a class of bank account
class BankAccount{
    // declaring bankName as static because it does not depend on the object
    static String bankName = "State Bank of India";
    String accountHolderName;
    // account number cannot be changed so it is declared final
    final String accountNumber;
    static int totalAccounts = 0;

    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts += 1;
    }

    // print details of account holder
    void printDetails(){
        System.out.println("Bank name : " + bankName);
        System.out.println("Account Holder name : " + accountHolderName);
        System.out.println("Account number : " + accountNumber);
    }

    // method to return total number of accounts
     void getTotalAccounts(){
        System.out.println("Total number of accounts are : " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolderName = sc.nextLine();
        String accountNumber = sc.next();

        // creating new object for bank account
        BankAccount bankAccount = new BankAccount(accountHolderName, accountNumber);

        if(bankAccount instanceof BankAccount){
            System.out.println("Object is the instance of class");
        }
        else{
            System.out.println("Object is not the instance of class");
        }

        // print account holder details
        bankAccount.printDetails();

        // print total number of accounts
        bankAccount.getTotalAccounts();
    }
}
