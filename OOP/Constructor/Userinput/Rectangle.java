import java.util.Scanner;

class Rectangle {
    int length, width;

    // Parameterized constructor
  
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int l = sc.nextInt();

        System.out.print("Enter Width: ");
        int w = sc.nextInt();

        // Creating object using constructor
      
        Rectangle r1 = new Rectangle(l, w);

        r1.area();
        sc.close();
    }
}
