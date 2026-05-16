class Job {
    int qualification;
    int experience;

    // Default constructor with nested if-else
  
    Job() {
        qualification = 16;
        experience = 2;

        if (qualification >= 16) {
            if (experience >= 1) {
                System.out.println("Job Selected");
            } else {
                System.out.println("Rejected: No Experience");
            }
        } else {
            System.out.println("Rejected: Low Qualification");
        }
    }

    void display() {
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience);
    }

    public static void main(String[] args) {
        Job j1 = new Job();
        j1.display();
    }
}
