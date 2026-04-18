import java.util.Scanner;

public class DoWhileUserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int sum = 0;
        int temp = num;

        do {
            sum += temp % 10;
            temp = temp / 10;
            count++;
        } while (temp != 0);

        System.out.println("Total digits = " + count);
        System.out.println("Sum of digits = " + sum);
    }
}
