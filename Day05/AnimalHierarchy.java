// creating super class Animal
class Animal{
    String name;
    int age;

    // Constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("Animals make sound...");
    }

    void display(){
        System.out.println("Animal name is : " + name);
        System.out.println("Animal age is : " + age);
    }
}

// Dog class extending properties of parent class
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    @Override   // Anotation
        // Overriding method
    void makeSound(){
        System.out.println("Dog barks...");
    }
}

// Cat class extending properties of parent class
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    @Override
        // Overriding method
    void makeSound(){
        System.out.println("Cat meow...");
    }
}

// Bird class extending properties of parent class
class Bird extends Animal{

    Bird(String name, int age){
        super(name, age);
    }
    @Override
        // Overriding method
    void makeSound(){
        System.out.println("Birds chirp...");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        // creating object of super class
        Animal animal = new Animal("Animal", 20);
        // print make sound method
        animal.makeSound();

        Dog dog = new Dog("Dog", 6);
        // print make sound method
        dog.display();
        dog.makeSound();

        Cat cat = new Cat("Cat", 2);
        // print make sound method
        cat.display();
        cat.makeSound();

        Bird bird = new Bird("Bird", 3);
        // print make sound method
        bird.display();
        bird.makeSound();
    }
}
