import java.util.Scanner;

class License {
    int age;

    // Default constructor
    
    License() {
        age = 0;
    }

    void checkEligibility() {
        if (age >= 18) {
            System.out.println("Eligible for Driving License");
        } else {
            System.out.println("Not Eligible for Driving License");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        License l1 = new License(); // default constructor
        l1.age = age;

        l1.checkEligibility();

        sc.close();
    }
}
