import java.util.Scanner;

public class ForLoopUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;

        for (; num > 0; num = num / 10) {
            sum = sum + (num % 10);
        }

        System.out.println("Sum of digits = " + sum);
    }
}
