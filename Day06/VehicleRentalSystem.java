import java.util.Scanner;

// definition of Insurable interface
interface Insurable {
    float calculateInsurance();
    void getInsuranceDetails();
}

// definition of Vehicle class
abstract class Vehicle implements Insurable {
    // declaring the attributes of this class
    protected String vehicleNumber, type;
    protected float rentalRate;

    // defining the behaviour of this class :-

    // created an abstract method calculateRentalCost(int days)
    protected abstract void calculateRentalCost(int days);

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String vehicleNumber, String type, float rentalRate);

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("this is a vehicle.");
    }

    // providing definition of method from implemented interface, Insurable
    @Override
    public float calculateInsurance() {
        if(this instanceof Bike) return 500000;
        if(this instanceof Car) return 5000000;
        return 20000000;
    }
}

// definition of Car class
class Car extends Vehicle {
    // declaring the attributes of this class
    private float insuranceAmount;

    // defining the behaviour of this class :-

    // overriding setter method of Vehicle class
    @Override
    public void set(String vehicleNumber, String type, float rentalRate) {
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.insuranceAmount = calculateInsurance();
    }

    // creating getter methods
    public String getType() {
        return this.type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public float getRentalRate() {
        return this.rentalRate;
    }

    public float getInsuranceAmount() {
        return this.insuranceAmount;
    }

    // overriding the method from Insurable interface
    @Override
    public void getInsuranceDetails() {
        System.out.println("This vehicle has a term insurance of " + this.insuranceAmount + "Rs.");
    }

    // overriding the abstract method of Vehicle class
    @Override
    protected void calculateRentalCost(int days) {
        System.out.println("You are taking this vehicle on rent. \nYour Rent: " + days * this.rentalRate);
    }

    // overriding the displayDetails method of Vehicle class
    @Override
    public void displayDetails() {
        System.out.println("type of the Vehicle: " + this.getType() + "\nVehicle Number: " + this.getVehicleNumber() + "\nRental Rate: " + this.getRentalRate());
        getInsuranceDetails();
    }
}

// definition of Bike class
class Bike extends Vehicle {
    // declaring the attributes of this class
    private float insuranceAmount;

    // defining the behaviour of this class :-

    // overriding setter method of Vehicle class
    @Override
    public void set(String vehicleNumber, String type, float rentalRate) {
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.insuranceAmount = calculateInsurance();
    }

    // creating getter methods
    public String getType() {
        return this.type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public float getRentalRate() {
        return this.rentalRate;
    }

    public float getInsuranceAmount() {
        return this.insuranceAmount;
    }

    // overriding the method from Insurable interface
    @Override
    public void getInsuranceDetails() {
        System.out.println("This vehicle has a term insurance of " + this.insuranceAmount + "Rs.");
    }

    // overriding the abstract method of Vehicle class
    @Override
    protected void calculateRentalCost(int days) {
        System.out.println("You are taking this vehicle on rent. \nYour Rent: " + days * this.rentalRate);
    }

    // overriding the displayDetails method of Vehicle class
    @Override
    public void displayDetails() {
        System.out.println("type of the Vehicle: " + this.getType() + "\nVehicle Number: " + this.getVehicleNumber() + "\nRental Rate: " + this.getRentalRate());
        getInsuranceDetails();
    }
}

// definition of Truck class
class Truck extends Vehicle {
    // declaring the attributes of this class
    private float insuranceAmount;

    // defining the behaviour of this class :-

    // overriding setter method of Vehicle class
    @Override
    public void set(String vehicleNumber, String type, float rentalRate) {
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.insuranceAmount = calculateInsurance();
    }

    // creating getter methods
    public String getType() {
        return this.type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public float getRentalRate() {
        return this.rentalRate;
    }

    public float getInsuranceAmount() {
        return this.insuranceAmount;
    }

    // overriding the method from Insurable interface
    @Override
    public void getInsuranceDetails() {
        System.out.println("This vehicle has a term insurance of " + this.insuranceAmount + "Rs.");
    }

    // overriding the abstract method of Vehicle class
    @Override
    protected void calculateRentalCost(int days) {
        System.out.println("You are taking this vehicle on rent. \nYour Rent: " + days * this.rentalRate);
    }

    // overriding the displayDetails method of Vehicle class
    @Override
    public void displayDetails() {
        System.out.println("type of the Vehicle: " + this.getType() + "\nVehicle Number: " + this.getVehicleNumber() + "\nRental Rate: " + this.getRentalRate());
        getInsuranceDetails();
    }
}

// definition of VehicleRentalSystem class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for Vehicle details
        System.out.println("Enter number of Vehicles: ");
        int numberOfVehicles = sc.nextInt();

        // created an array of references of Vehicle class
        Vehicle [] vehicles = new Vehicle[numberOfVehicles];

        // iterating through a for loop to get input for the vehicles
        for (int i = 0; i < numberOfVehicles; i++) {
            // created variables for taking inputs for the attributes of vehicles
            System.out.println("Enter type of Vehicle-" + (i+1));
            String type = sc.nextLine();
            type = sc.nextLine(); // to avoid conflicts while taking inputs

            System.out.println("Enter Number of Vehicle-" + (i+1));
            String vehicleNumber = sc.next();

            System.out.println("Enter Rental Rate of Vehicle-" + (i+1));
            float rentalRate = sc.nextFloat();

            // initializing objects
            vehicles[i] = (type.charAt(0) == 'B')? new Bike() :(type.charAt(0) == 'C')? new Car() : new Truck();

            // setting attribute values
            vehicles[i].set(vehicleNumber, type, rentalRate);
            // getting the details of Vehicle
            vehicles[i].displayDetails();
            // renting this vehicle for 5 days
            vehicles[i].calculateRentalCost(5);
        }
    }
}