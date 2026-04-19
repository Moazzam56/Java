import java.util.Scanner;

// Book class

class Book {
    String title;
    int price;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}

// Main class

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Book 1
      
        Book b1 = new Book();
        System.out.println("Enter book 1 title:");
        b1.title = sc.nextLine();
        System.out.println("Enter price:");
        b1.price = sc.nextInt();
        sc.nextLine();
        b1.display();

        // Book 2
      
        Book b2 = new Book();
        System.out.println("Enter book 2 title:");
        b2.title = sc.nextLine();
        System.out.println("Enter price:");
        b2.price = sc.nextInt();
        sc.nextLine();
        b2.display();

        // Book 3
      
        Book b3 = new Book();
        System.out.println("Enter book 3 title:");
        b3.title = sc.nextLine();
        System.out.println("Enter price:");
        b3.price = sc.nextInt();

        b3.display();

        sc.close();
    }
}
