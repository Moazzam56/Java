import java.util.Scanner;

class Device {
    int powerUsage;

    // Default constructor
  
    Device() {
        powerUsage = 0;
    }

    void checkPower() {
        
      // nested if-else logic
      
        if (powerUsage > 1000) {
            if (powerUsage > 2000) {
                System.out.println("Danger: High Energy Consumption");
            } else {
                System.out.println("Warning: Medium Energy Usage");
            }
        } else {
            if (powerUsage > 500) {
                System.out.println("Normal Usage");
            } else {
                System.out.println("Low Power Device");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3 objects
      
        Device d1 = new Device();
        Device d2 = new Device();
        Device d3 = new Device();

        // user input
      
        System.out.print("Enter Power Usage for Device 1: ");
        d1.powerUsage = sc.nextInt();

        System.out.print("Enter Power Usage for Device 2: ");
        d2.powerUsage = sc.nextInt();

        System.out.print("Enter Power Usage for Device 3: ");
        d3.powerUsage = sc.nextInt();

        // method calls
      
        d1.checkPower();
        d2.checkPower();
        d3.checkPower();

        sc.close();
    }
}
