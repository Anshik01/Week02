import java.util.Scanner;

class Book{
    String title;
    String author;
    int price;

    // constructor to initialize attributes of book
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to print book details
    public void printBookDetails(){
        System.out.println("Title of book : " + title);
        System.out.println("Author of book : " + author);
        System.out.println("Price of book : " + price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input data
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        // initializing class using object
        Book book = new Book(title, author, price);
        // using printBookDetails method
        book.printBookDetails();
    }
}
