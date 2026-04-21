class Employee {
    int id;
    String name;
    String dept;
    double salary;

    // parameterized constructor
  
    Employee(int i, String n, String d, double s) {
        id = i;
        name = n;
        dept = d;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + dept + " " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
      
        // objects
      
        Employee e1 = new Employee(201, "Sara", "IT", 75000);
        Employee e2 = new Employee(202, "Ali", "HR", 50000);
        Employee e3 = new Employee(203, "Zain", "Finance", 65000);

        e1.display();
        e2.display();
        e3.display();
    }
}
