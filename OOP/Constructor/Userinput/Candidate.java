import java.util.Scanner;

class Candidate {
    int attendance;
    int marks;

    // Default constructor
  
    Candidate() {
        attendance = 0;
        marks = 0;
    }

    void checkResult() {
       
      // nested if-else logic
      
        if (attendance >= 75) {
            if (marks >= 50) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail (Low Marks)");
            }
        } else {
            if (marks >= 50) {
                System.out.println("Result: Fail (Low Attendance)");
            } else {
                System.out.println("Result: Fail");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 objects
      
        Candidate c1 = new Candidate();
        Candidate c2 = new Candidate();
        Candidate c3 = new Candidate();

        // user input
      
        System.out.println("Enter Attendance and Marks for Candidate 1:");
        c1.attendance = sc.nextInt();
        c1.marks = sc.nextInt();

        System.out.println("Enter Attendance and Marks for Candidate 2:");
        c2.attendance = sc.nextInt();
        c2.marks = sc.nextInt();

        System.out.println("Enter Attendance and Marks for Candidate 3:");
        c3.attendance = sc.nextInt();
        c3.marks = sc.nextInt();

        // method calls
      
        c1.checkResult();
        c2.checkResult();
        c3.checkResult();

        sc.close();
    }
}
