import java.util.Scanner;

class Weather {
    int temperature;

    // Default constructor
  
    Weather() {
        temperature = 0;
    }

    void checkWeather() {
        if (temperature > 40) {
            System.out.println("Weather: Extremely Hot");
        } else {
            if (temperature >= 25) {
                System.out.println("Weather: Warm");
            } else {
                System.out.println("Weather: Cold");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        int temp = sc.nextInt();

        Weather w1 = new Weather(); // default constructor
        w1.temperature = temp;

        w1.checkWeather();

        sc.close();
    }
}
