// Student class

class Student {
    String name;
    int age;

    // Display student details
  
    void display() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}

// Main class 

class Main {
    public static void main(String[] args) {

        // First student object
      
        Student S1 = new Student();
        S1.name = "Moazzam";
        S1.age = 18;
        S1.display();

        // Second student object
      
        Student S2 = new Student();
        S2.name = "Haseeb";
        S2.age = 18;
        S2.display();

        // Third student object
      
        Student S3 = new Student();
        S3.name = "Dawood";
        S3.age = 20;
        S3.display();
    }
}
