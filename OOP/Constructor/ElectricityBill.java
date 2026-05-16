class ElectricityBill {
    int units;
    double bill;

    // Parameterized constructor
  
    ElectricityBill(int u) {
        units = u;

        // if-else logic to calculate bill
      
        if (units <= 100) {
            bill = units * 5;
        } else {
            if (units <= 200) {
                bill = (100 * 5) + (units - 100) * 7;
            } else {
                bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }
        }
    }

    void display() {
        System.out.println("Units: " + units);
        System.out.println("Bill: " + bill);
    }

    public static void main(String[] args) {
        
      // Creating objects using parameterized constructor
      
        ElectricityBill b1 = new ElectricityBill(80);
        ElectricityBill b2 = new ElectricityBill(150);
        ElectricityBill b3 = new ElectricityBill(250);

        b1.display();
        b2.display();
        b3.display();
    }
}
