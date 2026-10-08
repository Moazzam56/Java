
import java.util.Scanner;

// Encapsulation: data is kept private

class EWallet {

    private String ownerName;
    private String walletId;
    private double balance;

    // Constructor initializes wallet data
  
    public EWallet(String ownerName, String walletId, double balance) {
        this.ownerName = ownerName;
        this.walletId = walletId;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter provides controlled access to balance
  
    public double getBalance() {
        return balance;
    }

    // Adds money after validation
  
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money added successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Makes payment after checking balance
  
    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Payment successful.");
        }
    }

    // Displays wallet information
  
    public void displayWallet() {
        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking wallet information from user
      
        System.out.println("===== SMART E-WALLET =====");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter wallet ID: ");
        String walletId = input.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        // Creating EWallet object
      
        EWallet wallet = new EWallet(
            name,
            walletId,
            initialBalance
        );

        int choice;

        // Menu runs until user chooses Exit
      
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Money");
            System.out.println("2. Make Payment");
            System.out.println("3. Check Balance");
            System.out.println("4. Wallet Details");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amount = input.nextDouble();
                    wallet.addMoney(amount);
                    break;

                case 2:
                    System.out.print("Enter payment: ");
                    double payment = input.nextDouble();
                    wallet.makePayment(payment);
                    break;

                case 3:
                    System.out.println(
                        "Balance: Rs. " + wallet.getBalance()
                    );
                    break;

                case 4:
                    wallet.displayWallet();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}
