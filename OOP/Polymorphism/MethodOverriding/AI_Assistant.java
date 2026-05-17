import java.util.Scanner;

// ================= PARENT CLASS =================

class AI_Assistant {

    void respond(String command) {

        System.out.println("\n[ BASIC AI RESPONSE ]");
        System.out.println("Processing Command: " + command);
        System.out.println("General Response Generated.");
    }
}

// ================= CHILD CLASS 1 =================

class MedicalAI extends AI_Assistant {

    @Override
    void respond(String symptom) {

        System.out.println("\n[ MEDICAL AI ANALYSIS ]");

        if (symptom.equalsIgnoreCase("fever")) {

            System.out.println("Possible Infection Detected");
            System.out.println("Suggested Action: Drink Water & Rest");

        } else if (symptom.equalsIgnoreCase("headache")) {

            System.out.println("Possible Stress or Migraine");
            System.out.println("Suggested Action: Take Proper Sleep");

        } else {

            System.out.println("Symptom Not Found in Database");
        }
    }
}

// ================= CHILD CLASS 2 =================

class MilitaryAI extends AI_Assistant {

    @Override
    void respond(String threatLevel) {

        System.out.println("\n[ MILITARY DEFENSE AI ]");

        if (threatLevel.equalsIgnoreCase("high")) {

            System.out.println("MISSILE DEFENSE SYSTEM ACTIVATED");
            System.out.println("Deploying Security Drones");

        } else if (threatLevel.equalsIgnoreCase("medium")) {

            System.out.println("Border Surveillance Increased");

        } else {

            System.out.println("Area Secure");
        }
    }
}

// ================= MAIN CLASS =================

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AI_Assistant system;

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("        ADVANCED AI CONTROL HUB");
            System.out.println("======================================");

            System.out.println("1. Medical AI");
            System.out.println("2. Military AI");
            System.out.println("3. Basic AI");
            System.out.println("4. Exit");

            System.out.print("\nSelect AI System: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {

                case 1:

                    system = new MedicalAI();

                    System.out.print("\nEnter Symptom: ");
                    String symptom = sc.nextLine();

                    system.respond(symptom);

                    break;

                case 2:

                    system = new MilitaryAI();

                    System.out.print("\nEnter Threat Level (high/medium/low): ");
                    String level = sc.nextLine();

                    system.respond(level);

                    break;

                case 3:

                    system = new AI_Assistant();

                    System.out.print("\nEnter General Command: ");
                    String command = sc.nextLine();

                    system.respond(command);

                    break;

                case 4:

                    System.out.println("\nAI Systems Shutdown Complete.");
                    break;

                default:

                    System.out.println("\nInvalid Selection!");
            }

        } while (choice != 4);

        sc.close();
    }
}
