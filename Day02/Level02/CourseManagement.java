// definition of Course class
class Course {
    // declaring the attributes of this class
    // declaring attributes private for security
    private String courseName;
    private float durationInWeeks, fee;
    static String instituteName = "Static Institute Name"; // name of the institute

    // created a parameterized constructor to get the values of the attributes from the user
    Course(String courseName, float durationInWeeks, float fee) {
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.fee = fee;
    }

    // created a method to display the details of all courses
    static void displayCourseDetails(Course [] obj) {
        // displaying all course details
        for (Course course : obj) {
            System.out.println("course name: " + course.courseName + ", duration: " + course.durationInWeeks + " weeks, fee: " + course.fee + ", institute: " + instituteName);
        }
    }

    // created the method to find the name of the institute
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// definition of CourseManagement class
public class CourseManagement {
    public static void main(String[] args) {
        // created an array of objects of Course class
        Course[] obj = new Course[5];

        // initializing all objects
        for (int i = 0; i < 5; i++) {
            obj[i] = new Course("course"+(i+1), (i+3), (i+1)*2000);
        }

        // displaying the details of all objects
        Course.displayCourseDetails(obj);

        // update name of institute
        Course.updateInstituteName("updated static institute name");

        // displaying the details of all objects after updating name of institute
        Course.displayCourseDetails(obj);
    }
}