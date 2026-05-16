import java.util.Scanner;

class Display {

    void show(int a) {
        System.out.println("Integer value: " + a);
    }

    void show(float a) {
        System.out.println("Float value: " + a);
    }

    void show(double a) {
        System.out.println("Double value: " + a);
    }

    void show(char a) {
        System.out.println("Character value: " + a);
    }

    void show(String a) {
        System.out.println("String value: " + a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Display obj = new Display();

        // Integer
      
        System.out.print("Enter Integer: ");
        int i = sc.nextInt();
        obj.show(i);

        // Float
      
        System.out.print("Enter Float: ");
        float f = sc.nextFloat();
        obj.show(f);

        // Double
      
        System.out.print("Enter Double: ");
        double d = sc.nextDouble();
        obj.show(d);

        // Character
      
        System.out.print("Enter Character: ");
        char c = sc.next().charAt(0);
        obj.show(c);

        // String
      
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        obj.show(s);

        sc.close();
    }
}
