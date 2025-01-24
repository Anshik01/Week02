// Parent class declaration
class Device{
    int deviceId;
    String status;

    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayInfo(){
        System.out.println("Device Id : " + deviceId);
        System.out.println("Device status : " + status);

    }
}

// declaring child class that extends Device
class Thermostat extends Device{
    String temperatureSetting;

    Thermostat(int deviceId, String status, String temperatureSetting){
        // inheriting constructor using super keyword
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus(){
        // inheriting method using super keyword
        super.displayInfo();
        System.out.println("Temperature setting : " + temperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        // creating object of child class
        Thermostat thermostat = new Thermostat(101, "On" , "High");
        // calling method to display status
        thermostat.displayStatus();
    }
}
