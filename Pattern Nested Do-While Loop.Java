public class PatternDoWhile {
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
