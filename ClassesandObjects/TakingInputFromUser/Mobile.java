import java.util.Scanner;

// Mobile class

class Mobile {
    String brand;
    int price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        // Mobile 1
      
        Mobile m1 = new Mobile();
        System.out.println("Enter brand 1:");
        m1.brand = sc.nextLine();
        System.out.println("Enter price:");
        m1.price = sc.nextInt();
        sc.nextLine();
        m1.display();
      
        // Mobile 2 
      
        Mobile m2 = new Mobile();
        System.out.println("Enter brand 2:");
        m2.brand = sc.nextLine();
        System.out.println("Enter price:");
        m2.price = sc.nextInt();
        sc.nextLine();
        m2.display();
      
        // Mobile 3
      
        Mobile m3 = new Mobile();
        System.out.println("Enter brand 3:");
        m3.brand = sc.nextLine();
        System.out.println("Enter price:");
        m3.price = sc.nextInt();
        sc.nextLine();
        m3.display();
      
        // Mobile 4
      
        Mobile m4 = new Mobile();
        System.out.println("Enter brand 4:");
        m4.brand = sc.nextLine();
        System.out.println("Enter price:");
        m4.price = sc.nextInt();

        m4.display();

        sc.close();
    }
}
