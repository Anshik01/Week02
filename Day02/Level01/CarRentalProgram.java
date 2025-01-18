// definition of CarRental class
class CarRental {
    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private String customerName, carModel;
    private int rentalDays, costPerDay = 1500;

    // created a non-parameterized constructor to initialize the object with default values
    CarRental() {
        this.customerName = "no one";
        this.carModel = "not available";
        this.rentalDays = 0;
    }

    // created a parameterized constructor to initialize the object with user defined values
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // created a method to get the total cost of the customer
    public void getCost() {
        int totalCost = this.costPerDay * this.rentalDays;

        // displaying total cost
        System.out.println(this.customerName + ", your cost for renting " + this.carModel + " car, for " + this.rentalDays + " days is: " + totalCost);
    }
}

// definition of CarRentalProgram
public class CarRentalProgram {
    public static void main(String[] args) {
        // created an object of CarRental class
        CarRental carRent = new CarRental(); // object carRent is initialized with default values of attributes of CarRental class

        // providing user defined values to the attributes of carRent
        carRent = new CarRental("Customer-A", "Model-A", 15);

        // getting total cost of renting the car
        carRent.getCost();
    }
}