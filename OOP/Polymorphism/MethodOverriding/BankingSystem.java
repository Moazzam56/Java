import java.util.Scanner;

// =====================================================
// PARENT CLASS
// =====================================================

class BankingSystem {

    void transaction(double amount) {

        System.out.println("\n========== STANDARD BANKING ==========");
        System.out.println("Transaction Amount : $" + amount);
        System.out.println("Processing through Standard Banking Network");
        System.out.println("Transaction Completed Successfully");
    }
}

// =====================================================
// CHILD CLASS 1
// =====================================================

class CryptoBanking extends BankingSystem {

    @Override
    void transaction(double amount) {

        System.out.println("\n========== CRYPTO BLOCKCHAIN ==========");
        System.out.println("Initiating Blockchain Verification...");
        System.out.println("Encrypting Digital Wallet...");
        System.out.println("Crypto Transfer Successful : $" + amount);
        System.out.println("Hash Verification Completed");
    }
}

// =====================================================
// CHILD CLASS 2
// =====================================================

class BiometricBanking extends BankingSystem {

    @Override
    void transaction(double amount) {

        System.out.println("\n========== BIOMETRIC PAYMENT ==========");
        System.out.println("Scanning Retina Pattern...");
        System.out.println("Fingerprint Authentication Success");
        System.out.println("Secure Biometric Transaction Approved");
        System.out.println("Amount Paid : $" + amount);
    }
}

// =====================================================
// MAIN CLASS
// =====================================================

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankingSystem bank;

        System.out.println("==========================================");
        System.out.println("      INTELLIGENT BANKING NETWORK");
        System.out.println("==========================================");

        System.out.print("\nEnter Transaction Amount : ");
        double amount = sc.nextDouble();

        sc.nextLine();

        System.out.print(
                "\nChoose Banking Method\n" +
                "(crypto / biometric / standard): ");

        String type = sc.nextLine();

        // Runtime Polymorphism

        if (type.equalsIgnoreCase("crypto")) {

            bank = new CryptoBanking();

        } else if (type.equalsIgnoreCase("biometric")) {

            bank = new BiometricBanking();

        } else {

            bank = new BankingSystem();
        }

        // Overridden Method Call
        bank.transaction(amount);

        System.out.println("\nBanking Session Ended Securely.");

        sc.close();
    }
}
