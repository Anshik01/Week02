import java.util.ArrayList;
import java.util.List;
// Hospital class
class Hospital
{
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital()
    {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor)
    {
        if (!doctors.contains(doctor))
        {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient)
    {
        if (!patients.contains(patient))
        {
            patients.add(patient);
        }
    }

    public List<Doctor> getDoctors()
    {
        return new ArrayList<>(doctors);  // Return a copy to prevent external modification
    }

    public List<Patient> getPatients()
    {
        return new ArrayList<>(patients);  // Return a copy to prevent external modification
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name)
    {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    // Modified to prevent infinite recursion
    public void assignPatient(Patient patient)
    {
        if (!patients.contains(patient))
        {
            patients.add(patient);
            patient.assignDoctor(this, false);  // Pass false to prevent recursive call
        }
    }

    public void consult(Patient patient)
    {
        if (patients.contains(patient))
        {
            System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
        } else
        {
            System.out.println("Doctor " + name + " has no consultation with patient " + patient.getName());
        }
    }

    public List<Patient> getPatients()
    {
        return new ArrayList<>(patients);  // Return a copy to prevent external modification
    }
}

// Patient class
class Patient
{
    private String name;
    private List<Doctor> doctors;

    public Patient(String name)
    {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }
    public void assignDoctor(Doctor doctor, boolean addToDoctor)
    {
        if (!doctors.contains(doctor))
        {
            doctors.add(doctor);
            if (addToDoctor)
            {
                doctor.assignPatient(this);
            }
        }
    }

    public List<Doctor> getDoctors()
    {
        return new ArrayList<>(doctors);  // Return a copy to prevent external modification
    }
}
public class HospitalDoctorAndPatient
{
    public static void main(String[] args)
    {
        // Create a hospital
        Hospital hospital = new Hospital();

        // Create doctors
        Doctor doctor1 = new Doctor("Anshik");
        Doctor doctor2 = new Doctor("Aayush");

        // Create patients
        Patient patient1 = new Patient("Durgesh");
        Patient patient2 = new Patient("Varsha");
        Patient patient3 = new Patient("Ansh");

        // Add doctors and patients to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Assign patients to doctors
        doctor1.assignPatient(patient1);
        doctor1.assignPatient(patient2);
        doctor2.assignPatient(patient2);
        doctor2.assignPatient(patient3);

        // Display relationships
        System.out.println("Hospital Status:");
        System.out.println("\nDoctors and their patients:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("\n" + doctor.getName() + "'s patients:");
            for (Patient patient : doctor.getPatients()) {
                System.out.println("- " + patient.getName());
            }
        }

        System.out.println("\nPatients and their doctors:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("\n" + patient.getName() + "'s doctors:");
            for (Doctor doctor : patient.getDoctors()) {
                System.out.println("- " + doctor.getName());
            }
        }

        // Demonstrate consultations
        System.out.println("\nConsultations:");
        doctor1.consult(patient1);
        doctor1.consult(patient3);  // Should show no consultation
        doctor2.consult(patient2);
    }
}