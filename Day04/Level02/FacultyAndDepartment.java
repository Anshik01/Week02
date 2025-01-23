import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department1 {
    private String name;
    private List<Faculty> faculties;

    public Department1(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}

class University {
    private String name;
    private List<Department1> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department1 department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public List<Department1> getDepartments() {
        return departments;
    }

    public void deleteUniversity() {
        departments.clear();
    }
}

public class FacultyAndDepartment {
    public static void main(String[] args)
    {
        // Create Faculty members
        Faculty faculty1 = new Faculty("Dr.Nischal Kausal");
        Faculty faculty2 = new Faculty("Dr. Anjani Johravanshi");

        // Create Departments
        Department1 csDepartment = new Department1("Computer Science");
        Department1 mathDepartment = new Department1("Mathematics");

        // Add Faculty to Departments
        csDepartment.addFaculty(faculty1);
        mathDepartment.addFaculty(faculty2);

        // Create University
        University university = new University("Tech University");

        // Add Departments to University
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Display University details
        System.out.println("University: " + university.getName());
        for (Department1 dept : university.getDepartments()) {
            System.out.println("Department: " + dept.getName());
            for (Faculty faculty : dept.getFaculties()) {
                System.out.println("Faculty: " + faculty.getName());
            }
        }

        // Delete University and its Departments
        university.deleteUniversity();
        System.out.println("University deleted. Departments: " + university.getDepartments().size());

        // Faculty members still exist independently
        System.out.println("Independent Faculty: " + faculty1.getName());
        System.out.println("Independent Faculty: " + faculty2.getName());
    }
}