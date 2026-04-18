public class NestedIfElseExample2 {
    public static void main(String[] args) {
        int temperature = 35;
        boolean isRaining = false;

        if (temperature > 30) {
            if (isRaining) {
                System.out.println("Hot and Rainy: Stay Indoors");
            } else {
                System.out.println("Very Hot: Drink Water and Stay Cool");
            }
        } else {
            if (temperature >= 20) {
                System.out.println("Pleasant Weather: Good for Outdoor Activities");
            } else {
                System.out.println("Cold Weather: Wear Warm Clothes");
            }
        }
    }
}
