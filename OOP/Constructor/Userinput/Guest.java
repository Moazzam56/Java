import java.util.Scanner;

class Guest {
    int budget;
    int days;
    String roomType;

    // Parameterized constructor
  
    Guest(int b, int d) {
        budget = b;
        days = d;

        // nested if-else for room allocation
      
        if (budget >= 10000) {
            if (days >= 5) {
                roomType = "Luxury Suite with Discount";
            } else {
                roomType = "Luxury Suite";
            }
        } else {
            if (budget >= 5000) {
                if (days >= 5) {
                    roomType = "Deluxe Room with Discount";
                } else {
                    roomType = "Deluxe Room";
                }
            } else {
                roomType = "Standard Room";
            }
        }
    }

    void display() {
        System.out.println("Budget: " + budget +
                ", Days: " + days +
                ", Room: " + roomType);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 objects with user input
      
        System.out.println("Enter Budget & Days for Guest 1:");
        Guest g1 = new Guest(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Budget & Days for Guest 2:");
        Guest g2 = new Guest(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Budget & Days for Guest 3:");
        Guest g3 = new Guest(sc.nextInt(), sc.nextInt());

        g1.display();
        g2.display();
        g3.display();

        sc.close();
    }
}
