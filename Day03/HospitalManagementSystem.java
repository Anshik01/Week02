import java.util.Scanner;

class Patient{
    static String hospitalName = "Apple Hospital";   // does not depend on object
    static int totalPatient = 0;
    String name;
    int age;
    String ailment;
    final int patientId;   // unique attribute

    // creating constructor to initialize object
    Patient(String name, int age, String ailment, int patientId){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
        totalPatient += 1;
    }

    // method print total number of patient
    static void getTotalPatient(){
        System.out.println("Total number of patient : " + totalPatient);
    }

    void printDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Ailment : " + ailment);
        System.out.println("Patient ID : " + patientId);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input data
        String name = sc.nextLine();
        int age = sc.nextInt();
        String ailment = sc.next();
        int patientID = sc.nextInt();

        // create object
        Patient patient = new Patient(name, age, ailment, patientID);

        // check instance
        if(patient instanceof Patient){
            System.out.println(Patient.hospitalName);
            patient.printDetails();
            Patient.getTotalPatient();
        }
    }
}
