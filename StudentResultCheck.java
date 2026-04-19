import java.util.Scanner;

// This program evaluates student result based on marks and attendance using nested if-else

public class StudentResultCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = input.nextInt();

        if (marks >= 50) {
            if (attendance >= 75) {
                System.out.println("Pass with Good Attendance");
            } else {
                System.out.println("Pass but Low Attendance Warning");
            }
        } else {
            if (marks >= 30) {
                System.out.println("Supplementary Exam Required");
            } else {
                System.out.println("Fail");
            }
        }

        input.close();
    }
}
