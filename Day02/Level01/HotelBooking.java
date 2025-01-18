import java.util.Scanner;

class Booking{
    String guestName;
    String roomType;
    int nights;

    // Non-perimeterized constructor
    public Booking(){
        this.guestName = "Unknown";
        this.roomType = "Economy";
        this.nights = 0;
    }

    // Perimeterized constructor
    public Booking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    public Booking(Booking book){
        this.guestName = book.guestName;
        this.roomType = book.roomType;
        this.nights = book.nights;
    }

    // print method
    public void printDetails(){
        System.out.println("Guest name : " + guestName);
        System.out.println("Room type : " + roomType);
        System.out.println("Nights : " + nights);
    }
}

public class HotelBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // input information
        String guestName = sc.nextLine();
        String roomType = sc.nextLine();
        int nights = sc.nextInt();

        // creating object of parameterized constructor
        Booking book1 = new Booking();

        // creating object of non-parameterized constructor
        Booking book2 = new Booking(guestName, roomType, nights);

        // creating object of copy constructor
        Booking book3 = new Booking(book2);

        // printing all three objects
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
    }
}
