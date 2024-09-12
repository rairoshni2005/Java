//Write a Java program to create an abstract class Animal with an abstract method called soundo. Create subclasses Lion and Cat that extend the Animal class and implement the sound method to make a specific sound for each animal.

// Abstract class Animal
abstract class Animal {
    // Abstract method sound
    abstract void sound();
}

// Class Lion extends Animal
class Lion extends Animal {
    // Implementation of the sound method for Lion
    @Override
    void sound() {
        System.out.println("The Lion roars: Roarrr!");
    }
}

// Class Cat extends Animal
class Cat extends Animal {
    // Implementation of the sound method for Cat
    @Override
    void sound() {
        System.out.println("The Cat meows: Meow!");
    }
}

// Main class to test the Animal class and its subclasses
public class animal_sounds {
    public static void main(String[] args) {
        // Create instances of Lion and Cat
        Animal lion = new Lion();
        Animal cat = new Cat();

        // Call the sound method for each animal
        lion.sound();
        cat.sound();
    }
}
