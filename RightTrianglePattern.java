public class RightTrianglePattern {
    
    // This program prints a number pattern using nested do-while loops
    
    public static void main(String[] args) {
        int i = 1;

        do {
            int j = 1;

            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i <= 5);
    }
}
