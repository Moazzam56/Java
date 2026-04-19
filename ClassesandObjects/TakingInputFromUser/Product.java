import java.util.Scanner;

// Product class

class Product {
    String name;
    int price;

    // Display product details
  
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product s1 = new Product();

        System.out.println("Enter name:");
        s1.name = sc.nextLine();

        System.out.println("Enter price:");
        s1.price = sc.nextInt();

        s1.display();

        sc.close(); 
    }
}
