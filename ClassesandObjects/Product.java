// Product class

class Product {
    String name;
    int price;
    int quantity;

    // Display bill details
  
    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + (price * quantity));
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        // Product 1
      
        Product p1 = new Product();
        p1.name = "Mobile";
        p1.price = 30000;
        p1.quantity = 2;
        p1.display();

        // Product 2
      
        Product p2 = new Product();
        p2.name = "Headphones";
        p2.price = 5000;
        p2.quantity = 1;
        p2.display();

        // Product 3
      
        Product p3 = new Product();
        p3.name = "Keyboard";
        p3.price = 3000;
        p3.quantity = 2;
        p3.display();

        // Product 4
      
        Product p4 = new Product();
        p4.name = "Mouse";
        p4.price = 1500;
        p4.quantity = 3;
        p4.display();
    }
}
