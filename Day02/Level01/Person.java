public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Rahul", 25);

        // Clone person1 using the copy constructor
        Person person2 = new Person(person1);

        // Modify the cloned person's details
        person2.setName("Rashmi");
        person2.setAge(30);

        // Display both objects
        System.out.println("Original Person:");
        person1.displayInfo();

        System.out.println("\nCloned Person:");
        person2.displayInfo();
    }
}
