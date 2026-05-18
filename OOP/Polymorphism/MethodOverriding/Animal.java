import java.util.Scanner;

// Parent class

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter animal type (animal/dog): ");
        String choice = sc.nextLine();

        Animal a;

        if(choice.equalsIgnoreCase("dog")) {
            a = new Dog();
        } else {
            a = new Animal();
        }

        a.sound();
    }
}
