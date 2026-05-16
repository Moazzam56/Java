class Car {
    String brand;
    int model;

    // Default constructor

    Car() {
        brand = "Toyota";
        model = 2022;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.display();
    }
}
