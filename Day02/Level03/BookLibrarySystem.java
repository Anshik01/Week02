// definition of Book class
class Book {
    // declaring the attributes of this class
    public String ISBN; // public attribute for easy access
    protected String title; // protected attribute for subclass access
    private String author; // private attribute for security

    // created a parameterized constructor to initialize attributes
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // created a method to set the author's name
    public void setAuthor(String authorName) {
        this.author = authorName; // updates the author's name
    }

    // created a method to get the author's name
    public String getAuthor() {
        return author; // returns the author's name
    }

    // created a method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

// definition of EBook class extending Book class
class EBook extends Book {
    // additional attribute for EBook
    private float fileSize; // private attribute to store file size

    // created a parameterized constructor to initialize attributes for EBook
    EBook(String ISBN, String title, String author, float fileSize) {
        // calling the constructor of the parent class
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // created a method to display EBook-specific details
    public void displayEBookDetails() {
        // accessing ISBN (public) and title (protected) directly
        System.out.println("EBook Details - ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB");
    }
}

// definition of BookLibrarySystem class
public class BookLibrarySystem {
    public static void main(String[] args) {
        // created an object of Book class
        Book book = new Book("1-2-3-4", "Book-A", "Author-A");

        // displaying book details
        book.displayBookDetails();

        // updating the author and displaying the updated details
        book.setAuthor("Author-B");
        System.out.println("Updated Author: " + book.getAuthor());

        // displaying book details after updating the author
        book.displayBookDetails();

        // created an object of EBook class
        EBook eBook = new EBook("11-22-33-44", "E-Book-A", "Author-B", 1.0f);

        // displaying eBook-specific details
        eBook.displayEBookDetails();
    }
}