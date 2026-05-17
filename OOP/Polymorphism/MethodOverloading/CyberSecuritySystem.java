import java.util.Scanner;

class CyberSecuritySystem {

    private final String ADMIN_NAME = "admin";
    private final String ADMIN_PASSWORD = "cyber123";
    private final int SECRET_PIN = 7860;
    private final String OTP = "A7X9";

    // ================= METHOD OVERLOADING =================

    // 1. PIN Authentication
  
    void authenticate(int pin) {

        System.out.println("\n[ PIN SECURITY CHECK ]");

        if (pin == SECRET_PIN) {
            System.out.println("ACCESS GRANTED");
            System.out.println("Security Level : LOW");
        } else {
            System.out.println("ACCESS DENIED");
            System.out.println("Incorrect Security PIN");
        }
    }

    // 2. Username + Password Authentication
  
    void authenticate(String username, String password) {

        System.out.println("\n[ ADMIN LOGIN CHECK ]");

        if (username.equals(ADMIN_NAME)
                && password.equals(ADMIN_PASSWORD)) {

            System.out.println("ADMIN ACCESS GRANTED");
            System.out.println("Security Level : HIGH");

        } else {

            System.out.println("ACCESS BLOCKED");
            System.out.println("Invalid Credentials");
        }
    }

    // 3. Biometric + OTP Verification
  
    void authenticate(String biometric, String otp, boolean trustedDevice) {

        System.out.println("\n[ BIOMETRIC SECURITY CHECK ]");

        if (biometric.equalsIgnoreCase("verified")
                && otp.equals(OTP)
                && trustedDevice) {

            System.out.println("BIOMETRIC VERIFIED");
            System.out.println("OTP VALIDATED");
            System.out.println("TRUSTED DEVICE DETECTED");
            System.out.println("ULTRA SECURE LOGIN SUCCESSFUL");

        } else {

            System.out.println("SECURITY BREACH DETECTED");
            System.out.println("MULTI-FACTOR AUTHENTICATION FAILED");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CyberSecuritySystem security = new CyberSecuritySystem();

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println("      CYBER SECURITY AUTH SYSTEM");
            System.out.println("========================================");

            System.out.println("1. PIN Authentication");
            System.out.println("2. Admin Login");
            System.out.println("3. Biometric + OTP Login");
            System.out.println("4. Exit");

            System.out.print("\nSelect Security Method : ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("\nEnter Secret PIN : ");
                    int pin = sc.nextInt();

                    security.authenticate(pin);

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("\nEnter Admin Username : ");
                    String user = sc.nextLine();

                    System.out.print("Enter Admin Password : ");
                    String pass = sc.nextLine();

                    security.authenticate(user, pass);

                    break;

                case 3:

                    System.out.print("\nBiometric Status (verified/not verified): ");
                    String bio = sc.nextLine();

                    System.out.print("Enter Secure OTP : ");
                    String otp = sc.nextLine();

                    System.out.print("Trusted Device? (true/false): ");
                    boolean trusted = sc.nextBoolean();

                    security.authenticate(bio, otp, trusted);

                    break;

                case 4:

                    System.out.println("\nSystem Shutdown Complete.");
                    System.out.println("Cyber Security Monitoring Stopped.");

                    break;

                default:

                    System.out.println("\nInvalid Security Option!");
            }

        } while (choice != 4);

        sc.close();
    }
}
