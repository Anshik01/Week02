// defining parent class
class Vehicle1{
    int maxSpeed;
    String model;

    // parent class constructor
    Vehicle1(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

// defining an interface
interface Refuelable{
    void refuel();
}

class ElectricVehicle extends Vehicle1{
    // invoke parent class constructor
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }

    void displayDetails(){
        System.out.println("Model of the vehicle : " + model);
        System.out.println("MaxSpeed of the vehicle : " + maxSpeed);
    }

    void charge(){
        System.out.println("Electric vehicle needs to charge");
    }
}

// PetrolVehicle is extending vehicle class and implementing Refuelable interface
class PetrolVehicle extends Vehicle1 implements Refuelable{

    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }

    void displayDetails(){
        System.out.println("Model of the vehicle : " + model);
        System.out.println("MaxSpeed of the vehicle : " + maxSpeed);
    }

    // Overridden method
    @Override
    public void refuel(){
        System.out.println("Petrol should be refueled");
    }
}
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // creating object of PetrolVehicle
        PetrolVehicle petrolVehicle = new PetrolVehicle(220, "Y62");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
        System.out.println();

        // Creating object of ElectricVehicle
        ElectricVehicle electricVehicle = new ElectricVehicle(200, "B140");
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();
    }
}
