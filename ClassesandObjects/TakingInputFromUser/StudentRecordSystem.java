import java.util.Scanner;

// Student class

class Student {
    String name;
    int marks;

    // Display result 
  
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: Calculated externally");
        System.out.println("-------------------------");
    }
}

// Main class

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student 1
      
        Student s1 = new Student();
        System.out.println("Enter name:");
        s1.name = sc.nextLine();
        System.out.println("Enter marks:");
        s1.marks = sc.nextInt();
        sc.nextLine();
        s1.display();

        // Student 2
      
        Student s2 = new Student();
        System.out.println("Enter name:");
        s2.name = sc.nextLine();
        System.out.println("Enter marks:");
        s2.marks = sc.nextInt();
        sc.nextLine();
        s2.display();

        // Student 3
      
        Student s3 = new Student();
        System.out.println("Enter name:");
        s3.name = sc.nextLine();
        System.out.println("Enter marks:");
        s3.marks = sc.nextInt();
        sc.nextLine();
        s3.display();

        // Student 4
      
        Student s4 = new Student();
        System.out.println("Enter name:");
        s4.name = sc.nextLine();
        System.out.println("Enter marks:");
        s4.marks = sc.nextInt();
        sc.nextLine();
        s4.display();

        // Student 5
      
        Student s5 = new Student();
        System.out.println("Enter name:");
        s5.name = sc.nextLine();
        System.out.println("Enter marks:");
        s5.marks = sc.nextInt();

        s5.display();

        sc.close();
    }
}
