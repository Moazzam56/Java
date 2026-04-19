import java.util.Scanner;

// Employee class

class Employee {
    String name;
    int salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------");
    }
}

// Main class

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee 1
      
        Employee e1 = new Employee();
        System.out.println("Enter name 1:");
        e1.name = sc.nextLine();
        System.out.println("Enter salary:");
        e1.salary = sc.nextInt();
        sc.nextLine();
        e1.display();

        // Employee 2
      
        Employee e2 = new Employee();
        System.out.println("Enter name 2:");
        e2.name = sc.nextLine();
        System.out.println("Enter salary:");
        e2.salary = sc.nextInt();
        sc.nextLine();
        e2.display();

        // Employee 3
      
        Employee e3 = new Employee();
        System.out.println("Enter name 3:");
        e3.name = sc.nextLine();
        System.out.println("Enter salary:");
        e3.salary = sc.nextInt();
        sc.nextLine();
        e3.display();

        // Employee 4
      
        Employee e4 = new Employee();
        System.out.println("Enter name 4:");
        e4.name = sc.nextLine();
        System.out.println("Enter salary:");
        e4.salary = sc.nextInt();
        sc.nextLine();
        e4.display();

        // Employee 5
      
        Employee e5 = new Employee();
        System.out.println("Enter name 5:");
        e5.name = sc.nextLine();
        System.out.println("Enter salary:");
        e5.salary = sc.nextInt();

        e5.display();

        sc.close();
    }
}
