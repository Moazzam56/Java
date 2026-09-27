public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        int sum = 0;
        
        // using for loop
        
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first 10 numbers = " + sum);
    }
}
