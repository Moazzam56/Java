class University {
    String department;
    int semester;

    // Default constructor

    University() {
        department = "Computer Science";
        semester = 4;
    }

    void display() {
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
    }

    public static void main(String[] args) {
        University u1 = new University();

        u1.display();
    }
}
