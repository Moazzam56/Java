class Exam {
    int attendance;

    // Default constructor
  
    Exam() {
        attendance = 0;
    }

    // Method to check eligibility
  
    void checkEligibility() {
        if (attendance >= 90) {
            System.out.println("Allowed to Exam");
        } else {
            if (attendance >= 75) {
                System.out.println("Warning: Borderline Attendance");
            } else {
                System.out.println("Not Allowed to Exam");
            }
        }
    }

    public static void main(String[] args) {
      
      // Creating 3 objects
      
        Exam e1 = new Exam();
        Exam e2 = new Exam();
        Exam e3 = new Exam();

        // Assigning attendance values
      
        e1.attendance = 95;
        e2.attendance = 80;
        e3.attendance = 60;

        // Checking eligibility
      
        e1.checkEligibility();
        e2.checkEligibility();
        e3.checkEligibility();
    }
}
