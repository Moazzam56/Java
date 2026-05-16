import java.util.Scanner;

class FoodOrder {
    int amount;
    String membership;

    // Parameterized constructor
  
    FoodOrder(int a, String m) {
        amount = a;
        membership = m;

        // if-else discount logic
      
        if (membership.equals("gold")) {
            if (amount >= 1000) {
                System.out.println("20% Discount Applied");
            } else {
                System.out.println("10% Discount Applied");
            }
        } else {
            if (amount >= 1000) {
                System.out.println("10% Discount Applied");
            } else {
                System.out.println("No Discount");
            }
        }
    }

    void display() {
        System.out.println("Amount: " + amount);
        System.out.println("Membership: " + membership);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Order Amount: ");
        int amount = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Membership (gold/normal): ");
        String membership = sc.nextLine();

        FoodOrder f1 = new FoodOrder(amount, membership);
        f1.display();

        sc.close();
    }
}
