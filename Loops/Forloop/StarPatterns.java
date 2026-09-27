import java.util.Scanner;

// This program prints star patterns based on user input using nested for loops

public class StarPatterns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = input.nextInt();

        // Square pattern
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Right triangle pattern
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
