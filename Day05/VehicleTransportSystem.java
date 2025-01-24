// Defining base class
class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo(){
        System.out.println("MaxSpeed of the vehicle is : " + maxSpeed);
        System.out.println("Fuel Type of vehicle is : " + fuelType);
        System.out.println();
    }
}

// Car inheriting properties of base class Vehicle
class Car extends Vehicle{
    // unique attribute seatCapacity
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overridden Method
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the Car is : " + maxSpeed);
        System.out.println("Fuel Type of Car is : " + fuelType);
        System.out.println("Seat Capacity of the Car is : " + seatCapacity);
        System.out.println();
    }
}

// Truck inheriting properties of base class Vehicle
class Truck extends Vehicle{
    // unique attribute millage
    int millage;

    Truck(int maxSpeed, String fuelType, int millage){
        super(maxSpeed, fuelType);
        this.millage = millage;
    }

    // Overridden Method
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the Truck is : " + maxSpeed);
        System.out.println("Fuel Type of Truck is : " + fuelType);
        System.out.println("Millage of the Truck is : " + millage);
        System.out.println();
    }
}

// MotorCycle inheriting properties of base class Vehicle
class MotorCycle extends Vehicle{
    // unique attribute headLight
    String headLight;

    MotorCycle(int maxSpeed, String fuelType, String headLight){
        super(maxSpeed, fuelType);
        this.headLight = headLight;
    }

    // Overridden Method
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the MotorCycle is : " + maxSpeed);
        System.out.println("Fuel Type of MotorCycle is : " + fuelType);
        System.out.println("Head light of the MotorCycle is : " + headLight);
        System.out.println();
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        // object of parent class
        Vehicle vehicle = new Vehicle(50, "Petrol");

        // Object of car class
        Car car = new Car(180, "Petrol", 4);

        // Object of Truck class
        Truck truck = new Truck(120, "Desiel", 50);

        // Object of MotorCycle class
        MotorCycle motorCycle = new MotorCycle(150, "Electric", "LED");

        // storing all objects in an array
        Vehicle[] ans = new Vehicle[3];
        ans[0] = car;
        ans[1] = truck;
        ans[2] = motorCycle;

        // displaying displayDetail method of all the objects
        for (Vehicle an : ans) {
            an.displayInfo();
        }
    }
}
