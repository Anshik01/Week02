// definition of Book class
class Book2 { // name of class is Book2 since Book class is already in the same package

    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private String title = "Book2", author = "writer2";
    private float price = 500f;
    private boolean availability = true;

    // created a parameterized constructor to initialize the object with user defined values
    Book2(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // created a method to borrow this book
    public void borrow() {
        if (availability) {
            System.out.println("Book Borrowed.");
            availability = false;
            return;
        }
        System.out.println("Book not available.");
    }
}

// definition of LibraryProgram class
public class LibraryProgram {
    public static void main(String[] args) {
        // created object of Book2 class
        Book2 book = new Book2("book2Actual", "writer2Actual", 1000f);

        // one person borrowing book
        book.borrow(); // should be borrowed

        // another person trying to borrow the same book
        book.borrow(); // should be unavailable since its already borrowed
    }
}