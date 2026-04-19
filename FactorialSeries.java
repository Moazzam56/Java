public class FactorialSeries {
    public static void main(String[] args) {

        // Outer loop: runs from 1 to 10
        for (int n = 1; n <= 10; n++) {

            long fact = 1;

            // Inner loop: calculates factorial of current number n
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println(n + "! = " + fact);
        }
    }
}
