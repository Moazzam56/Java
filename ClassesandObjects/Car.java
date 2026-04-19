// Car class

class Car {
    String colour, model;
    int speed;

    // Display car details
  
    void display() {
        System.out.println(colour);
        System.out.println(model);
        System.out.println(speed);
    }
}

// Main class 

public class Main {
    public static void main(String[] args) {

        // Creating Car object
      
        Car M1 = new Car();

        // Assigning values
      
        M1.colour = "Black";
        M1.model = "Honda Civic";
        M1.speed = 150;

        // Display output
      
        M1.display();
    }
}
