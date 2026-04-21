class Book {
    int id;
    String title;
    double price;

    // constructor
  
    Book(int i, String t, double p) {
        id = i;
        title = t;
        price = p;
    }

    void show() {
        System.out.println(id + " " + title + " " + price);
    }
}

public class Main {
    public static void main(String[] args) { 
      
        // objects
      
        Book b1 = new Book(1, "Java", 500);
        Book b2 = new Book(2, "Python", 450);
        Book b3 = new Book(3, "C++", 400);
        Book b4 = new Book(4, "HTML", 300);

        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
