// definition of GPS interface
interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

// definition of Vehiclee class which implements GPS interface
abstract class Vehiclee implements GPS {  // driverName of the class is Vehiclee since Vehicle class is already there in same packratePerKm
    // declaring the attributes of this class
    protected String driverName, vehicleeId, location;
    protected double ratePerKm;

    // defining the behaviour of this class :-

    // created an abstract method calculateFare(double distance)
    protected abstract double calculateFare(double distance);

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String driverName, String vehicleeId, double ratePerKm, String location);

    // created a concrete method getVehicleeDetails()
    protected void getVehicleeDetails() {
        System.out.println("this is a Vehiclee.");
    }

    // providing definition of methods from GPS interface
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: " + this.location);
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

// definition of Carr class
class Carr extends Vehiclee { // since Car class is already there in same package

    // overriding setter method of Vehiclee class
    @Override
    public void set(String driverName, String  vehicleeId, double ratePerKm, String location) {
        this. vehicleeId =  vehicleeId;
        this.driverName = driverName;
        this.ratePerKm =  ratePerKm;
        this.location = location;
    }

    // creating getter methods
    public String getVehicleeId() {
        return this.vehicleeId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public double getRatePerKm() {
        return this.ratePerKm;
    }

    // overriding the abstract method of Vehiclee class
    @Override
    protected double calculateFare(double distance) {
        return this.ratePerKm * distance;
    }

    // overriding the getVehicleeDetails method of Vehiclee class
    @Override
    public void getVehicleeDetails() {
        System.out.println("Details of the Vehicle:\nDriver Name: " + getDriverName() + "\nVehicle ID: " + getVehicleeId() + "\nRate Per Km: " + getRatePerKm());
        getCurrentLocation(); // getting current location of this vehicle
        // getting vehicle on rent for 5 kilometer
        getOnRent(5);
    }

    public void getOnRent(double distance) {
        System.out.println("You have booked this vehicle for 5 kilometers and your fare is: " + calculateFare(distance));
    }
}

// definition of Bikee class
class Bikee extends Vehiclee { // since Bike class is already there in same package

    // overriding setter method of Vehiclee class
    @Override
    public void set(String driverName, String  vehicleeId, double ratePerKm, String location) {
        this. vehicleeId =  vehicleeId;
        this.driverName = driverName;
        this.ratePerKm =  ratePerKm;
        this.location = location;
    }

    // creating getter methods
    public String getVehicleeId() {
        return this.vehicleeId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public double getRatePerKm() {
        return this.ratePerKm;
    }

    // overriding the abstract method of Vehiclee class
    @Override
    protected double calculateFare(double distance) {
        return this.ratePerKm * distance;
    }

    // overriding the getVehicleeDetails method of Vehiclee class
    @Override
    public void getVehicleeDetails() {
        System.out.println("Details of the Vehicle:\nDriver Name: " + getDriverName() + "\nVehicle ID: " + getVehicleeId() + "\nRate Per Km: " + getRatePerKm());
        getCurrentLocation(); // getting current location of this vehicle
        // getting vehicle on rent for 5 kilometer
        getOnRent(5);
    }

    public void getOnRent(double distance) {
        System.out.println("You have booked this vehicle for 5 kilometers and your fare is: " + calculateFare(distance));
    }
}

// definition of Auto class
class Auto extends Vehiclee {

    // overriding setter method of Vehiclee class
    @Override
    public void set(String driverName, String  vehicleeId, double ratePerKm, String location) {
        this. vehicleeId =  vehicleeId;
        this.driverName = driverName;
        this.ratePerKm =  ratePerKm;
        this.location = location;
    }

    // creating getter methods
    public String getVehicleeId() {
        return this.vehicleeId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public double getRatePerKm() {
        return this.ratePerKm;
    }

    // overriding the abstract method of Vehiclee class
    @Override
    protected double calculateFare(double distance) {
        return this.ratePerKm * distance;
    }

    // overriding the getVehicleeDetails method of Vehiclee class
    @Override
    public void getVehicleeDetails() {
        System.out.println("Details of the Vehicle:\nDriver Name: " + getDriverName() + "\nVehicle ID: " + getVehicleeId() + "\nRate Per Km: " + getRatePerKm());
        getCurrentLocation(); // getting current location of this vehicle
        // getting vehicle on rent for 5 kilometer
        getOnRent(5);
    }

    public void getOnRent(double distance) {
        System.out.println("You have booked this vehicle for 5 kilometers and your fare is: " + calculateFare(distance));
    }
}

// definition of RideHailingApplication class
public class RideHailingApplication {
    public static void main(String[] args) {
        // created object of Carr class using reference of Vehiclee class
        Vehiclee vehiclee1 = new Carr();
        // providing state to this object
        vehiclee1.set("Anshik", "V01", 12, "Bhopal");
        // displaying the details of first Vehiclee
        vehiclee1.getVehicleeDetails();

        // created object of Bikee class using reference of Vehiclee class
        Vehiclee vehiclee2 = new Bikee();
        // providing state to this object
        vehiclee2.set("Aman", "V02", 9, "Bhopal");
        // displaying the details of second Vehiclee
        vehiclee2.getVehicleeDetails();

        // created object of Auto class using reference of Vehiclee class
        Vehiclee vehiclee3 = new Auto();
        // providing state to this object
        vehiclee3.set("Jaiswal", "V03", 7, "Bhopal");
        // displaying the details of third Vehiclee
        vehiclee3.getVehicleeDetails();
    }
}