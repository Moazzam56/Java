import java.util.Scanner;

// Circle class

class Circle {
    double radius;

    // Display area and circumference
  
    void display() {
        System.out.println("Area: " + (3.14 * radius * radius));
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }
}

// Main class

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();

        System.out.println("Enter radius:");
        c1.radius = sc.nextDouble();

        c1.display();

        sc.close();
    }
}
