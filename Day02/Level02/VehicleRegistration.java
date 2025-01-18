// definition of Vehicle class
class Vehicle {
    // declaring the attributes of this class
    // declaring attributes private for security
    private String ownerName, vehicleType;
    static float registrationFee = 12000f; // common for all objects

    // created a parameterized constructor to get the values of the attributes from the user
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // created a method to display the details of all Vehicles
    static void displayVehicleDetails(Vehicle [] obj) {
        // displaying all Vehicle details
        for (Vehicle vehicle : obj) {
            System.out.println("Vehicle type: " + vehicle.vehicleType + ", owner name: " + vehicle.ownerName + " registration fee: " + registrationFee);
        }
    }

    // created the method to update registration fee
    static void updateRegistrationFee(float newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}

// definition of VehicleRegistration class
public class VehicleRegistration {
    public static void main(String[] args) {
        // created an array of objects of Vehicle class
        Vehicle[] obj = new Vehicle[5];

        // initializing all objects
        for (int i = 0; i < 5; i++) {
            obj[i] = new Vehicle("Owner"+(i+1), "Vehicle"+(i+1));
        }

        // displaying the details of all objects
        Vehicle.displayVehicleDetails(obj);

        // update registration fee
        Vehicle.updateRegistrationFee(14500f);

        // displaying the details of all objects after updating fee of registration
        Vehicle.displayVehicleDetails(obj);
    }
}