import java.util.Scanner;

// This program checks loan eligibility based on salary and credit score using nested if-else

public class LoanEligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        System.out.print("Enter your credit score: ");
        int creditScore = input.nextInt();

        if (salary >= 30000) {
            if (creditScore >= 700) {
                System.out.println("Loan Approved (High Limit)");
            } else {
                System.out.println("Loan Approved (Low Limit)");
            }
        } else {
            if (creditScore >= 700) {
                System.out.println("Loan Under Review");
            } else {
                System.out.println("Loan Rejected");
            }
        }

        input.close();
    }
}
