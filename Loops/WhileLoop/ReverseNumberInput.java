import java.util.Scanner;

public class ReverseNumberInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;
        
        // using while loop
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse = " + reverse);
        System.out.println("Original = " + original);
    }
}
