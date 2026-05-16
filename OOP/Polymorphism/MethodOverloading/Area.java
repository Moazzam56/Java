import java.util.Scanner;

class Area {

    // Circle
  
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    // Rectangle
  
    void area(int length, int width) {
        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }

    // Triangle
  
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("===== Area Calculator =====");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            obj.area(r);

        } else if (choice == 2) {
            System.out.print("Enter length: ");
            int l = sc.nextInt();
            System.out.print("Enter width: ");
            int w = sc.nextInt();
            obj.area(l, w);

        } else if (choice == 3) {
            System.out.print("Enter base: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();
            obj.area(b, h);

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
