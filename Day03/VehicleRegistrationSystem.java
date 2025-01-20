import java.util.Scanner;

class Vehicle{
    static int registrationFee = 1000;   // does not depend on object
    String ownerName;
    String vehicleType;
    final String registrationNumber;   // unique attribute

    // constructor of class
    Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // method to update registration fee
    static void updateRegistrationFee(int fee){
        registrationFee = fee;
    }

    void printDetails(){
        System.out.println("Owner name : " + ownerName);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Registration Number : " + registrationNumber);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String name = sc.nextLine();
        String vehicleType = sc.next();
        String registrationNumber = sc.next();

        // create object of class
        Vehicle vehicle = new Vehicle(name, vehicleType, registrationNumber);

        if(vehicle instanceof Vehicle){
            vehicle.printDetails();
            System.out.println("Default Registration Fee : " + Vehicle.registrationFee);
            Vehicle.updateRegistrationFee(1500);
            System.out.println("Updated Registration Fee : " + Vehicle.registrationFee);
        }
    }
}
