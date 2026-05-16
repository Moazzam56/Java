class Shop {
    int amount;

    // Default constructor
  
    Shop() {
        amount = 0;
    }

    // Method to check discount using nested if-else
  
    void checkDiscount() {
        if (amount >= 10000) {
            System.out.println("20% Discount");
        } else {
            if (amount >= 5000) {
                System.out.println("10% Discount");
            } else {
                System.out.println("No Discount");
            }
        }
    }

    public static void main(String[] args) {
        
      // Creating 3 objects
        Shop s1 = new Shop();
        Shop s2 = new Shop();
        Shop s3 = new Shop();

       // Assigning purchase amounts
      
        s1.amount = 12000;
        s2.amount = 7000;
        s3.amount = 3000;

        // Checking discount for each object
      
        s1.checkDiscount();
        s2.checkDiscount();
        s3.checkDiscount();
    }
}
