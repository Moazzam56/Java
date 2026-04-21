class Car {
    String brand;
    String model;
    int year;
    double price;
    String color;

    // parameterized constructor
  
    Car(String b, String m, int y, double p, String c) {
        brand = b;
        model = m;
        year = y;
        price = p;
        color = c;
    }

    void show() {
        System.out.println(brand + " " + model + " " + year + " " + price + " " + color);
    }
}

public class Main {
    public static void main(String[] args) {
      
        // objects
      
        Car c1 = new Car("Toyota", "Corolla", 2022, 4500000, "White");
        Car c2 = new Car("Honda", "Civic", 2023, 5500000, "Black");
        Car c3 = new Car("Suzuki", "Swift", 2021, 3000000, "Red");
        Car c4 = new Car("Kia", "Sportage", 2024, 8000000, "Blue");

        c1.show();
        c2.show();
        c3.show();
        c4.show();
    }
}
