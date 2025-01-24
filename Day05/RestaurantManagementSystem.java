// Defining parent class
class Person1{
    String name;
    int id;

    // parent class constructor
    Person1(String name, int id){
        this.name = name;
        this.id = id;
    }
}

// defining an interface
interface Worker{
    // abstract method performDuties
    void performDuties();
}

// chef is extending Person and implements worker interface
class Chef extends Person1 implements Worker{
    Chef(String name, int id){
        super(name, id);
    }

    // Overridden method
    @Override
    public void performDuties(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Performs duty of cooking");
    }

}

// waiter is extending Person and implements worker interface
class Waiter extends Person1 implements Worker{
    Waiter(String name, int id){
        super(name, id);
    }

    // Overridden method
    @Override
    public void performDuties(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Performs duty of serving");
    }
}
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // creating object of waiter
        Waiter waiter = new Waiter("Aayush", 101);
        waiter.performDuties();
        System.out.println();

        // creating object of chef
        Chef chef = new Chef("Anshik", 102);
        chef.performDuties();
        System.out.println();
    }
}
