import java.util.Scanner;

class Calculator {

    // Addition
    void calculate(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Subtraction
    void calculate(double a, double b) {
        System.out.println("Difference = " + (a - b));
    }

    // Multiplication
    void calculate(float a, float b) {
        System.out.println("Product = " + (a * b));
    }

    // Division
    void calculate(int a, int b, char op) {
        if (b != 0) {
            System.out.println("Division = " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        // Addition
        System.out.print("Enter 2 integers for Addition: ");
        obj.calculate(sc.nextInt(), sc.nextInt());

        // Subtraction
        System.out.print("Enter 2 doubles for Subtraction: ");
        obj.calculate(sc.nextDouble(), sc.nextDouble());

        // Multiplication
        System.out.print("Enter 2 floats for Multiplication: ");
        obj.calculate(sc.nextFloat(), sc.nextFloat());

        // Division
        System.out.print("Enter 2 integers for Division: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.calculate(a, b, '/');

        sc.close();
    }
}
