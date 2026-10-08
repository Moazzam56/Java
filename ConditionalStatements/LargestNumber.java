import java.util.Scanner;

public class LargestNumber {
    
    // This program finds the largest of two numbers using if-else conditions with user input
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Largest number is: " + a);
        } else if (b > a) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }

        input.close();
    }
}
