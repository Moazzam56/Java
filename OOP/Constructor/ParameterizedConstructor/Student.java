class Student {
    int id;
    String name;

    // constructor
  
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
      
        // objects
      
        Student s1 = new Student(101, "Ali");
        Student s2 = new Student(102, "Sara");
        Student s3 = new Student(103, "Ahmed");

        s1.display();
        s2.display();
        s3.display();
    }
}
