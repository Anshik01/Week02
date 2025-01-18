import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;

    // example of default constructor
    public Book(){
        // assigning random values
        this.title = "Unknown title";
        this.author = "Random author";
        this.price = 0.0;
    }

    // example of parameterized constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // printing details of book
    public void printDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}
public class BookDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextInt();

        // creating an object using non-parameterized constructor
        Book ansWithoutParameters = new Book();

        // creating an object using parameterized constructor
        Book ansWithParameters = new Book(title, author, price);

        // print output using parameterized constructor
        ansWithParameters.printDetails();

        // print output using non-parameterized constructor
        ansWithoutParameters.printDetails();
    }
}
