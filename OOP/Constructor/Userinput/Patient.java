import java.util.Scanner;

class Patient {
    int age;
    String condition;

    // Parameterized constructor
  
    Patient(int a, String c) {
        age = a;
        condition = c;

        // if-else priority check
      
        if (age > 60) {
            if (condition.equals("critical")) {
                System.out.println("High Priority Patient");
            } else {
                System.out.println("Medium Priority Patient");
            }
        } else {
            System.out.println("Normal Priority Patient");
        }
    }

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Condition: " + condition);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Condition (normal/critical): ");
        String condition = sc.nextLine();

        Patient p1 = new Patient(age, condition);
        p1.display();

        sc.close();
    }
}
