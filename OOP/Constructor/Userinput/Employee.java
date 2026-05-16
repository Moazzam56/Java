import java.util.Scanner;

class Employee {
    String name;
    double salary;

    // Parameterized constructor
  
    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Creating object using constructor
      
        Employee e1 = new Employee(name, salary);

        e1.display();
        sc.close();
    }
}
