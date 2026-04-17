import java.util.Scanner;

public class SquarePatternInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
