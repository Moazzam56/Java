import java.util.Scanner;

class Passenger {
    int age;
    int luggageWeight;

    // Default constructor

    Passenger() {
        age = 0;
        luggageWeight = 0;
    }

    void checkSecurity() {
       
      // nested if-else logic
      
        if (age > 60) {
            if (luggageWeight <= 20) {
                System.out.println("Fast Track Security Allowed");
            } else {
                System.out.println("Extra Luggage Check Required");
            }
        } else {
            if (luggageWeight <= 15) {
                System.out.println("Normal Security Clearance");
            } else {
                System.out.println("Luggage Over Limit");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 objects
        Passenger p1 = new Passenger();
        Passenger p2 = new Passenger();
        Passenger p3 = new Passenger();

        // user input for 3 passengers
        System.out.print("Enter Age and Luggage for Passenger 1: ");
        p1.age = sc.nextInt();
        p1.luggageWeight = sc.nextInt();

        System.out.print("Enter Age and Luggage for Passenger 2: ");
        p2.age = sc.nextInt();
        p2.luggageWeight = sc.nextInt();

        System.out.print("Enter Age and Luggage for Passenger 3: ");
        p3.age = sc.nextInt();
        p3.luggageWeight = sc.nextInt();

        // method calls
        p1.checkSecurity();
        p2.checkSecurity();
        p3.checkSecurity();

        sc.close();
    }
}
