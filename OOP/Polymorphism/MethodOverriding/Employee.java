import java.util.Scanner;

// Parent class

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

// Child class

class Manager extends Employee {

    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter role (employee/manager): ");
        String role = sc.nextLine();

        Employee e;

        if(role.equalsIgnoreCase("manager")) {
            e = new Manager();
        } else {
            e = new Employee();
        }

        e.work();
    }
}
