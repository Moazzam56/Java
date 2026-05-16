class Loan {
    int salary;

    // Default constructor
  
    Loan() {
        salary = 0;
    }

    // Method to check loan eligibility
  
    void checkLoan() {
        if (salary >= 50000) {
            System.out.println("Loan Approved");
        } else {
            if (salary >= 30000) {
                System.out.println("Partial Loan Approved");
            } else {
                System.out.println("Loan Rejected");
            }
        }
    }

    public static void main(String[] args) {
        
      // Creating 3 objects
      
        Loan l1 = new Loan();
        Loan l2 = new Loan();
        Loan l3 = new Loan();

        // Assigning salary values
      
        l1.salary = 60000;
        l2.salary = 35000;
        l3.salary = 20000;

        // Checking loan status
      
        l1.checkLoan();
        l2.checkLoan();
        l3.checkLoan();
    }
}
