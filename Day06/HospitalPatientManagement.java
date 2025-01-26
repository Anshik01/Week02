// definition of MedicalRecord interface
interface MedicalRecord {
    void addRecord(String registrationDate);
    void viewRecords();
}

// definition of Patient class which implements MedicalRecord interface
abstract class Patient implements MedicalRecord {
    // declaring the attributes of this class
    protected String name, patientId, registrationDate;
    protected int age;

    // defining the behaviour of this class :-

    // created an abstract method calculateBill()
    protected abstract float calculateBill();

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String name, String patientId, int age, String registrationDate);

    // created a concrete method getPatientDetails()
    protected void getPatientDetails() {
        System.out.println("this is a Patient.");
    }

    // providing definition of methods from MedicalRecord interface
    @Override
    public void addRecord(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public void viewRecords() {
        System.out.println("This patient was registered on " + this.registrationDate);
    }
}

// definition of InPatient class
class InPatient extends Patient {

    // overriding setter method of Patient class
    @Override
    public void set(String name, String  patientId, int age, String registrationDate) {
        this. patientId =  patientId;
        this.name = name;
        this. age =  age;
        addRecord(registrationDate);
    }

    // creating getter methods
    public String getPatientId() {
        return this.patientId;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // overriding the abstract method of Patient class
    @Override
    protected float calculateBill() {
        if (this.age >= 18) return 1000;
        return 750;
    }

    // overriding the getPatientDetails method of Patient class
    @Override
    public void getPatientDetails() {
        this.viewRecords();
        System.out.println("Details of the patient:\nName: " + getName() + "\nID: " + getPatientId() + "\nAge: " + getAge() + "\nBill: " + calculateBill());
    }
}

// definition of OutPatient class
class OutPatient extends Patient {

    // overriding setter method of Patient class
    @Override
    public void set(String name, String  patientId, int age, String registrationDate) {
        this. patientId =  patientId;
        this.name = name;
        this. age =  age;
        addRecord(registrationDate);
    }

    // creating getter methods
    public String getPatientId() {
        return this.patientId;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // overriding the abstract method of Patient class
    @Override
    protected float calculateBill() {
        if (this.age >= 18) return 1500;
        return 1200;
    }

    // overriding the getPatientDetails method of Patient class
    @Override
    public void getPatientDetails() {
        this.viewRecords();
        System.out.println("Details of the patient:\nName: " + getName() + "\nID: " + getPatientId() + "\nAge: " + getAge() + "\nBill: " + calculateBill());
    }
}

// definition of HospitalPatientManagement class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // created object of InPatient class using reference of Patient class
        Patient patient1 = new InPatient();
        // providing state to this object
        patient1.set("Anshik", "P01", 10, "25-01-2025");
        // displaying the details of first patient
        patient1.getPatientDetails();

        // created object of OutPatient class using reference of Patient class
        Patient patient2 = new OutPatient();
        // providing state to this object
        patient2.set("Amsn", "P02", 20, "26-01-2025");
        // displaying the details of second patient
        patient2.getPatientDetails();
    }
}