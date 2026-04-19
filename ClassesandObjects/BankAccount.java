// BankAccount class

class BankAccount {
    String accountHolder;
    int balance;

    // Deposit money
  
    void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited");
    }

    // Display account details
  
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        // Account 1
      
        BankAccount b1 = new BankAccount();
        b1.accountHolder = "Ali";
        b1.deposit(5000);
        b1.display();

        // Account 2
      
        BankAccount b2 = new BankAccount();
        b2.accountHolder = "Ahmed";
        b2.deposit(8000);
        b2.display();

        // Account 3
      
        BankAccount b3 = new BankAccount();
        b3.accountHolder = "Hassan";
        b3.deposit(3000);
        b3.display();

        // Account 4
      
        BankAccount b4 = new BankAccount();
        b4.accountHolder = "Usman";
        b4.deposit(10000);
        b4.display();

        // Account 5
      
        BankAccount b5 = new BankAccount();
        b5.accountHolder = "Bilal";
        b5.deposit(2000);
        b5.display();
    }
}
