class Hospital {
    String patientName;
    int roomNo;

    // Default constructor
    
    Hospital() {
        patientName = "Ali";
        roomNo = 12;
    }

    void display() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Room Number: " + roomNo);
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital();

        h1.display();
    }
}
