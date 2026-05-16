class Library {
    int daysLate;
    int fine;

    // Parameterized constructor
  
    Library(int d) {
        daysLate = d;

        // if-else logic for fine calculation
      
        if (daysLate <= 5) {
            fine = daysLate * 2;
        } else {
            if (daysLate <= 10) {
                fine = (5 * 2) + (daysLate - 5) * 5;
            } else {
                fine = (5 * 2) + (5 * 5) + (daysLate - 10) * 10;
            }
        }
    }

    void display() {
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine: " + fine);
    }

    public static void main(String[] args) {
        
      // Creating objects using parameterized constructor
      
        Library l1 = new Library(3);
        Library l2 = new Library(7);
        Library l3 = new Library(12);

        l1.display();
        l2.display();
        l3.display();
    }
}
