import java.util.Scanner;

class Ticket {
    int age;
    int distance;
    int fare;

    // Parameterized constructor
  
    Ticket(int a, int d) {
        age = a;
        distance = d;

        // nested if-else for fare calculation
      
        if (age <= 5) {
            fare = 0;
        } else {
            if (age > 60) {
                fare = distance * 2;
            } else {
                if (distance <= 100) {
                    fare = distance * 5;
                } else {
                    fare = distance * 3;
                }
            }
        }
    }

    void display() {
        System.out.println("Age: " + age + ", Distance: " + distance + ", Fare: " + fare);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input for 3 objects
      
        System.out.println("Enter Age and Distance for Passenger 1:");
        Ticket t1 = new Ticket(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Age and Distance for Passenger 2:");
        Ticket t2 = new Ticket(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Age and Distance for Passenger 3:");
        Ticket t3 = new Ticket(sc.nextInt(), sc.nextInt());

        // display results
      
        t1.display();
        t2.display();
        t3.display();

        sc.close();
    }
}
