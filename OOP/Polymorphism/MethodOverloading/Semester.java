import java.util.Scanner;

// Semester Class

class Semester {

    String studentName;
    int semesterNo;

    // Constructor
  
    Semester(String studentName, int semesterNo) {
        this.studentName = studentName;
        this.semesterNo = semesterNo;
    }

    // Method Overloading - 1 Subject
  
    void calculateFee(int creditHours) {

        int fee = creditHours * 5000;

        System.out.println("\n===== Semester Fee Record =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Semester No  : " + semesterNo);
        System.out.println("Credit Hours : " + creditHours);
        System.out.println("Total Fee    : " + fee);
    }

    // Method Overloading - 2 Subjects
  
    void calculateFee(int creditHours, int labCharges) {

        int fee = (creditHours * 5000) + labCharges;

        System.out.println("\n===== Semester Fee Record =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Semester No  : " + semesterNo);
        System.out.println("Credit Hours : " + creditHours);
        System.out.println("Lab Charges  : " + labCharges);
        System.out.println("Total Fee    : " + fee);
    }

    // Method Overloading - Scholarship Version
  
    void calculateFee(int creditHours,
                      int labCharges,
                      double scholarship) {

        double fee = (creditHours * 5000) + labCharges;

        double finalFee = fee - scholarship;

        System.out.println("\n===== Semester Fee Record =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Semester No  : " + semesterNo);
        System.out.println("Credit Hours : " + creditHours);
        System.out.println("Lab Charges  : " + labCharges);
        System.out.println("Scholarship  : " + scholarship);
        System.out.println("Final Fee    : " + finalFee);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   UNIVERSITY SEMESTER SYSTEM");
        System.out.println("==================================");

        // User Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Semester Number: ");
        int semester = sc.nextInt();

        Semester s = new Semester(name, semester);

        System.out.println("\nSelect Fee Structure");
        System.out.println("1. Simple Fee");
        System.out.println("2. Fee with Lab Charges");
        System.out.println("3. Fee with Scholarship");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:

                System.out.print("Enter Credit Hours: ");
                int ch1 = sc.nextInt();

                // Overloaded Method 1
                s.calculateFee(ch1);
                break;

            case 2:

                System.out.print("Enter Credit Hours: ");
                int ch2 = sc.nextInt();

                System.out.print("Enter Lab Charges: ");
                int lab = sc.nextInt();

                // Overloaded Method 2
                s.calculateFee(ch2, lab);
                break;

            case 3:

                System.out.print("Enter Credit Hours: ");
                int ch3 = sc.nextInt();

                System.out.print("Enter Lab Charges: ");
                int lab2 = sc.nextInt();

                System.out.print("Enter Scholarship Amount: ");
                double scholarship = sc.nextDouble();

                // Overloaded Method 3
                s.calculateFee(ch3, lab2, scholarship);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        System.out.println("\n==================================");
        System.out.println("      Semester Record Saved");
        System.out.println("==================================");

        sc.close();
    }
}
