class License {
    int age;

    // Default constructor

    License() {
        age = 17;

        // if-else check
        if (age >= 18) {
            System.out.println("Eligible for Driving License");
        } else {
            System.out.println("Not Eligible for Driving License");
        }
    }

    void display() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        License l1 = new License();
        l1.display();
    }
}
