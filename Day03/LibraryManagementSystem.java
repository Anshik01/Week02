import java.util.Scanner;

class Book{
    // using static with library name because it does not depend on object
    static String libraryName = "Study Hours";
    String title;
    String author;
    final String isbn;    // isbn value is unique that's why final

    // creating constructor
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method to print library name
    static void displayLibraryName(){
        System.out.println("Library name : " + libraryName);
    }

    // print book info
    void printDetails(){
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + isbn);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String title = sc.nextLine();
        String author = sc.nextLine();
        String isbn = sc.next();

        Book book = new Book(title, author, isbn);

        // checking instance of object
        if(book instanceof Book){
            Book.displayLibraryName();
            book.printDetails();
        }
    }
}
