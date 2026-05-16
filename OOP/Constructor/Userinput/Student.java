import java.util.Scanner;

class Student {
    int id;
    String name;

    // Parameterized Constructor
  
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
      // Creating object using constructor
      
        Student s1 = new Student(id, name);
        s1.display();

        sc.close();
    }
}
