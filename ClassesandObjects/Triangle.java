// Triangle class

class Triangle {
    int base;
    int height;

    // Display area
  
    void display() {
        System.out.println("Area: " + (0.5 * base * height));
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        // Triangle object
      
        Triangle t1 = new Triangle();
        t1.base = 10;
        t1.height = 5;

        t1.display();
    }
}
