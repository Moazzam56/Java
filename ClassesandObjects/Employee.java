// Employee class

class Employee {
    String name;
    double salary;

    // Display employee details

    void display() {
        System.out.println(name);
        System.out.println(salary);
    }
}

// Main class 

public class Main {
    public static void main(String[] args) {

        // Creating Employee object

        Employee T1 = new Employee();

        // Assigning values

        T1.name = "Abdullah";
        T1.salary = 50000;

        // Display output

        T1.display();
    }
}
