import java.util.Scanner;

public class SentinelSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        
        // using do-while loop
        
        do {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();

            sum = sum + num; 

        } while (num != 0);

        System.out.println("Total Sum = " + sum);
    }
}
