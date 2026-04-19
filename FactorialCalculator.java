import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        long fact = 1;
        
       // using for loop
        
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
