class Bakery {
    String cakeName;
    int price;

    // Default constructor
    Bakery() {
        cakeName = "Chocolate Cake";
        price = 1500;
    }

    void display() {
        System.out.println("Cake Name: " + cakeName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Bakery b1 = new Bakery();

        b1.display();
    }
}
