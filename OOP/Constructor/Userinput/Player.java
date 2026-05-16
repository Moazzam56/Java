import java.util.Scanner;

class Player {
    int fitness;
    int experience;

    // Parameterized constructor
  
    Player(int f, int e) {
        fitness = f;
        experience = e;

        // if-else selection logic
      
        if (fitness >= 80) {
            if (experience >= 2) {
                System.out.println("Selected for Team");
            } else {
                System.out.println("Need More Experience");
            }
        } else {
            System.out.println("Not Selected (Low Fitness)");
        }
    }

    void display() {
        System.out.println("Fitness: " + fitness);
        System.out.println("Experience: " + experience);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fitness (0-100): ");
        int fitness = sc.nextInt();

        System.out.print("Enter Experience (years): ");
        int experience = sc.nextInt();

        Player p1 = new Player(fitness, experience);
        p1.display();

        sc.close();
    }
}
