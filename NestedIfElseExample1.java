public class NestedIfElseExample1 {
    public static void main(String[] args) {
        int marks = 85;
        int attendance = 90;

        if (marks >= 80) {
            if (attendance >= 85) {
                System.out.println("Full Scholarship Granted");
            } else {
                System.out.println("Partial Scholarship Granted (Low Attendance)");
            }
        } else {
            if (marks >= 60) {
                System.out.println("No Scholarship, but Admission Allowed");
            } else {
                System.out.println("Not Eligible for Scholarship or Admission");
            }
        }
    }
}
