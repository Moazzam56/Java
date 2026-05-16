class MovieTicket {
    int age;
    String movie;

    // Default constructor with nested if-else
  
    MovieTicket() {
        age = 16;
        movie = "Action";

        if (movie == "Action") {
            if (age >= 15) {
                System.out.println("Ticket Booked");
            } else {
                System.out.println("Not Allowed: Age Restriction");
            }
        } else {
            System.out.println("Movie Not Available");
        }
    }

    void display() {
        System.out.println("Age: " + age);
        System.out.println("Movie: " + movie);
    }

    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        m1.display();
    }
}
