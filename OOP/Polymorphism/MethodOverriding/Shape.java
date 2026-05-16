import java.util.Scanner;

// Parent class

class Shape {
    void area() {
        System.out.println("Area calculation of shape");
    }
}

// Child class

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

// Child class

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        Circle c = new Circle(sc.nextDouble());

        System.out.print("Enter length and width of Rectangle: ");
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());

        c.area();
        r.area();

        sc.close();
    }
}
