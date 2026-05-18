import java.util.Scanner;

// Parent Class

class Person {

    String name;

    // Constructor
  
    Person(String name) {
        this.name = name;
    }

    // Method
  
    void displayRole() {
        System.out.println(name + " is a person in the university.");
    }
}

// Child Class 1

class Student extends Person {

    Student(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println(name + " is a Student.");
        System.out.println("Student can attend classes and submit assignments.");
    }
}

// Child Class 2

class Teacher extends Person {

    Teacher(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println(name + " is a Teacher.");
        System.out.println("Teacher can teach courses and mark attendance.");
    }
}

// Child Class 3

class Admin extends Person {

    Admin(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println(name + " is an Admin.");
        System.out.println("Admin manages university records and departments.");
    }
}

// Main Class

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== University Management System =====");

        // User Input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("\nSelect Role:");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.println("3. Admin");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Person p;

        // Runtime Polymorphism + Method Overriding
        switch(choice) {

            case 1:
                p = new Student(name);
                break;

            case 2:
                p = new Teacher(name);
                break;

            case 3:
                p = new Admin(name);
                break;

            default:
                p = new Person(name);
                System.out.println("Invalid choice!");
        }

        System.out.println("\n===== User Information =====");
        p.displayRole();

        sc.close();
    }
}
