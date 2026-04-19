import java.util.Scanner;

// Square class

class Square {
    int side;

    // Display area and perimeter
  
    void display() {
        System.out.println("Area: " + (side * side));
        System.out.println("Perimeter: " + (4 * side));
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First square object
      
        Square s1 = new Square();
        System.out.println("Enter side for Square 1:");
        s1.side = sc.nextInt();
        s1.display();

        // Second square object
      
        Square s2 = new Square();
        System.out.println("Enter side for Square 2:");
        s2.side = sc.nextInt();
        s2.display();

        sc.close();
    }
}
