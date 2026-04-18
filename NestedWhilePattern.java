public class NestedWhilePattern {
    public static void main(String[] args) {

        int i = 1;   // outer loop (rows)

        while (i <= 5) {

            int j = 1;  // inner loop (columns)

            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
