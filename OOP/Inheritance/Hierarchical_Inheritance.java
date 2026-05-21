import java.util.Scanner;

// Parent class

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class 1

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child class 2

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("=== Animal Selection ===");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {

            System.out.println("\n--- Calling from Dog Object ---");

            // Calling inherited method
          
            dog.eat();

            // Calling specific method of Dog class
          
            dog.bark();

        } 
        else if (choice == 2) {

            System.out.println("\n--- Calling from Cat Object ---");

            // Calling inherited method 
          
            cat.eat();

            // Calling specific method of Cat class
          
            cat.meow();

        } 
        else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        input.close();
    }
}
