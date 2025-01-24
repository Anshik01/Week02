// Book is the parent class
class Book{
    String title;
    int publicationYear;

    // Constructor of Book class
    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

}

// Defining Author class which extends Book
class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        // invoke parent class constructor using super keyword
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display information of Book with author
    void displayInfo(){

        System.out.println("Title of book : " + title);
        System.out.println("Publication year : " + publicationYear);
        System.out.println("Name of author : " + name);
        System.out.println("Bio of Author : " + bio);

    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // creating object of author class
        Author author = new Author("Good Vibes, Good life", 2021, "Vex King", "Author specialize in psychology.");
        // calling displayInfo method
        author.displayInfo();
    }
}
