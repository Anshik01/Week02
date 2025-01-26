import java.util.Scanner;

// definition of Reservable interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// definition of LibraryItem class
abstract class LibraryItem implements Reservable {
    // declaring the attributes of this class
    protected String itemId, title, author, borrowerName;
    protected boolean isAvailable = true;

    // defining the behaviour of this class :-

    // created an abstract method getLoanDuration()
    protected abstract String getLoanDuration();

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String itemId, String  title, String author);

    // created a concrete method getItemDetails()
    protected void getItemDetails() {
        System.out.println("this is a LibraryItem.");
    }

    // providing definition of method from Reservable interface
    @Override
    public void reserveItem() {
        Scanner sc = new Scanner(System.in); // object of scanner class
        if (checkAvailability()) {
            System.out.println("Enter your name:");
            borrowerName = sc.nextLine();
            System.out.println("Item is available and now it is reserved for " + this.borrowerName +  " for " + this.getLoanDuration());
            this.isAvailable = false;
        } else {
            System.out.println("Sorry this item is not available!");
        }
    }

    @Override
    public boolean checkAvailability() {
        return this.isAvailable;
    }
}

// definition of Book class
class Book extends LibraryItem {
    // defining the behaviour of this class :-

    // overriding setter method of LibraryItem class
    @Override
    public void set(String itemId, String  title, String author) {
        this. title =  title;
        this.itemId = itemId;
        this. author =  author;
    }

    // creating getter methods
    public String getTitle() {
        return this.title;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getAuthor() {
        return this.author;
    }

    // overriding the abstract method of LibraryItem class
    @Override
    protected String getLoanDuration() {
        return "30 Days";
    }

    // overriding the getItemDetails method of LibraryItem class
    @Override
    public void getItemDetails() {
        System.out.println("Title of the book: " + this.getTitle() + "\nISBN: " + this.getItemId() + "\nAuthor: " + this.getAuthor());
    }
}

// definition of Magazine class
class Magazine extends LibraryItem {
    // defining the behaviour of this class :-

    // overriding setter method of LibraryItem class
    @Override
    public void set(String itemId, String  title, String author) {
        this. title =  title;
        this.itemId = itemId;
        this. author =  author;
    }

    // creating getter methods
    public String getTitle() {
        return this.title;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getAuthor() {
        return this.author;
    }

    // overriding the abstract method of LibraryItem class
    @Override
    protected String getLoanDuration() {
        return "15 Days";
    }

    // overriding the getItemDetails method of LibraryItem class
    @Override
    public void getItemDetails() {
        System.out.println("Title of the Magazine: " + this.getTitle() + "\nID: " + this.getItemId() + "\nPublisher: " + this.getAuthor());
    }
}

// definition of DVD class
class DVD extends LibraryItem {
    // defining the behaviour of this class :-

    // overriding setter method of LibraryItem class
    @Override
    public void set(String itemId, String  title, String author) {
        this. title =  title;
        this.itemId = itemId;
        this. author =  author;
    }

    // creating getter methods
    public String getTitle() {
        return this.title;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getAuthor() {
        return this.author;
    }

    // overriding the abstract method of LibraryItem class
    @Override
    protected String getLoanDuration() {
        return "10 Days";
    }

    // overriding the getItemDetails method of LibraryItem class
    @Override
    public void getItemDetails() {
        System.out.println("Content of DVD: " + this.getTitle() + "\nDVD Serial Number: " + this.getItemId() + "\nCreator: " + this.getAuthor());
    }
}

// definition of LibraryManagementSystem class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for LibraryItem details
        System.out.println("Enter number of Library items: ");
        int numberOfLibraryItems = sc.nextInt();

        // created an array of references of LibraryItem class
        LibraryItem [] libraryItems = new LibraryItem[numberOfLibraryItems];

        // iterating through a for loop to get input for the LibraryItems
        for (int i = 0; i < numberOfLibraryItems; i++) {
            // created variables for taking inputs for the attributes of LibraryItems
            String  title;
            System.out.println("Enter  Title / Content of Library Item-" + (i+1));
            // to avoid conflicts while taking inputs
            if(i%2 == 0) title = sc.nextLine();
            title = sc.nextLine();

            System.out.println("Enter ID / Serial-No / ISBN of Library Item-" + (i+1));
            String itemId = sc.next();

            System.out.println("Enter Publisher / Creator / Author of Library Item-" + (i+1));
            String author = sc.nextLine();
            author = sc.nextLine(); // to avoid conflicts while taking inputs

            // initializing objects
            libraryItems[i] = ( itemId.charAt(0) == 'B')? new Book() :( itemId.charAt(0) == 'M')? new Magazine() : new DVD();

            // setting attribute values
            libraryItems[i].set(itemId,  title,  author);
            // getting the details of LibraryItem
            libraryItems[i].getItemDetails();
            // reserving this item
            libraryItems[i].reserveItem();
            // reserving the same item again
            libraryItems[i].reserveItem();
        }
    }
}