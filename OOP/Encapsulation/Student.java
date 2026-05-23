import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double percentage;
    
    // Set data method
  
    void setData(String n, int r, double p) {
        name = n;
        rollNo = r;
        percentage = p;
    }
    
    // Display student details
  
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage + "%");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s = new Student(); // Create object
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine(); // Input name
        
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt(); // Input roll number
        
        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble(); // Input percentage
        
        s.setData(name, rollNo, percentage); // Pass data to class
        s.display(); // Show output
        
        sc.close(); // Close scanner
    }
}
