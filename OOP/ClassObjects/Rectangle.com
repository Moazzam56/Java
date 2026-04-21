// Rectangle class

class Rectangle {
    int length;
    int width;

    // Display area and perimeter
  
    void display() {
        System.out.println("Area: " + (length * width));
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

// Main class

public class Main {
    public static void main(String[] args) {

        // Rectangle object
      
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;

        r1.display();
    }
}
