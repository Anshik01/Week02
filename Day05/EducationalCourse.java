// defining Parent class
class Course{
    // declaring attributes
    String courseName;
    int duration;

    // Constructor of parent class
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails(){
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration);
    }
}

class OnlineCourse extends Course{
    String plateForm;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String plateForm, boolean isRecorded){
        super(courseName, duration);
        this.plateForm = plateForm;
        this.isRecorded = isRecorded;
    }

    // Overridden method
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform Name : " + plateForm);
        System.out.println("Are there recoded lectures : " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String plateForm, boolean isRecorded, int fee, int discount){
        super(courseName, duration, plateForm, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Course Fee : " + fee);
        System.out.println("Discount : " + discount);
    }
}
public class EducationalCourse {
    public static void main(String[] args) {
        // Object of Course class
        Course course = new Course("Java FullStack", 6);
        course.displayDetails();
        System.out.println();

        // Object of OnlineCourse class
        OnlineCourse onlineCourse = new OnlineCourse("Java FullStack", 6, "YouTube", true);
        onlineCourse.displayDetails();
        System.out.println();

        // Object of PaidOnlineCourse class
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java FullStack", 6, "YouTube", true, 15000, 10);
        paidOnlineCourse.displayDetails();
    }
}
