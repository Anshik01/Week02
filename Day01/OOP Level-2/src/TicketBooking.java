import java.util.Scanner; // imported scanner class

// definition of MovieTicket class
class MovieTicket {
    // created the attributes of MovieTicket class
    private String movieName = "Demo"; // this will be defined by the admin
    static final int noOfSeats = 100, pricePerSeat = 150; // this is predefined data
    static int[] allocatedSeats = new int[noOfSeats];
    int chosenSeat = 0;

    // created a method to book the tickets
    public boolean bookTicket(String movieName, int seatNumber) {
        if(this.movieName.equals(movieName)) { // checking if movie name entered by user is same as which is defined by admin
            // iterating through the array of allocatedSeats
            for(int i = 0; i < noOfSeats; i++) {
                if(seatNumber == allocatedSeats[i]) {
                    return false; // since seat is already allocated
                }
            }
            chosenSeat = seatNumber;
            return true; // since seat is not allocated yet
        }
        return false;
    }

    // created a method to display the ticket
    public void displayTicket(boolean isBooked) {
        if(isBooked) {
            System.out.println("The movie ticket is booked.");
            System.out.println("Movie name: " + this.movieName);
            System.out.println("Seat number: " + this.chosenSeat);
            System.out.println("Total price: " + pricePerSeat);
        }
        else {
            System.out.println("The movie ticket is not booked.");
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a variable to take input for movie name
        System.out.println("Enter the movie name");
        String movieName = sc.nextLine();

        // taking the input for seatNumber
        System.out.println("Enter the Seat number");
        int seatNumber = sc.nextInt();

        MovieTicket mt = new MovieTicket(); // object of MovieTicket class

        // booking the ticket is input seat number is available for booking
        boolean isBooked = mt.bookTicket(movieName, seatNumber);

        // displaying the ticket if booked
        mt.displayTicket(isBooked);

        sc.close(); // closing the scanner object
    }
}