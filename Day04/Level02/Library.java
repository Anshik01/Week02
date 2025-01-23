import java.util.*;
class Book
{
    String title;
    String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}
public class Library
{
    private ArrayList<Book> books = new ArrayList<Book>();
    Library()
    {

        this.books = new ArrayList<Book>();
    }
    public void addBook(Book b)
    {
        books.add(b);
    }
    void display()
    {
        for (Book b : books)
        {
            System.out.println(b.title + " : " + b.author);
        }
    }


    public static void main(String[] args)
    {
        Library lib = new Library();
        Book b1 = new Book("Good vibe good life", "Vex King");
        Book b2 = new Book("Attitude is everything ", "Jeff Keller");
        Book b3 = new Book("Think and grow rich ", "Nepolean Hills");
        lib.books.add(b1);
        lib.books.add(b2);
        lib.books.add(b3);
        lib.display();
    }
} 