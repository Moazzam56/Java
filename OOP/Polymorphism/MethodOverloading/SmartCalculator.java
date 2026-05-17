import java.util.Scanner;

class SmartCalculator {

    // Method Overloading for Addition
  
    int calculate(int a, int b) {
        return a + b;
    }

    // Method Overloading for Multiplication
  
    double calculate(double a, double b) {
        return a * b;
    }

    // Method Overloading for Power
  
    long calculate(int base, int exponent, char operation) {

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartCalculator calc = new SmartCalculator();

        int choice;

        do {

            System.out.println("\n========= SMART CALCULATOR =========");
            System.out.println("1. Add Two Integers");
            System.out.println("2. Multiply Two Decimal Numbers");
            System.out.println("3. Find Power");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter first integer: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second integer: ");
                    int b = sc.nextInt();

                    int sum = calc.calculate(a, b);

                    System.out.println("Result = " + sum);
                    break;

                case 2:

                    System.out.print("Enter first decimal number: ");
                    double x = sc.nextDouble();

                    System.out.print("Enter second decimal number: ");
                    double y = sc.nextDouble();

                    double product = calc.calculate(x, y);

                    System.out.println("Result = " + product);
                    break;

                case 3:

                    System.out.print("Enter base number: ");
                    int base = sc.nextInt();

                    System.out.print("Enter exponent: ");
                    int exponent = sc.nextInt();

                    long powerResult = calc.calculate(base, exponent, 'p');

                    System.out.println("Result = " + powerResult);
                    break;

                case 4:

                    System.out.println("Calculator Closed Successfully.");
                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
