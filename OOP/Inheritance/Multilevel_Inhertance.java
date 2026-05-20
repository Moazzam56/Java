import java.util.Scanner; 

// Parent class

class Animal {
    String food;

    void getFood(String food) {
        this.food = food; 
    }

    void eat() {
        System.out.println("Animal is eating: " + food);
    }
}

// Child class (inherits Animal)

class Dog extends Animal {
    String sound;

    void getSound(String sound) {
        this.sound = sound;
    }

    void bark() {
        System.out.println("Dog is barking: " + sound);
    }
}

// Grandchild class (multilevel inheritance)

class Puppy extends Dog {
    String emotion;

    void getEmotion(String emotion) {
        this.emotion = emotion;
    }

    void weep() {
        System.out.println("Puppy is weeping: " + emotion);
    }
}

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        Puppy p = new Puppy(); 

        // User input
      
        System.out.print("Enter food: ");
        p.getFood(sc.nextLine());

        System.out.print("Enter barking sound: ");
        p.getSound(sc.nextLine());

        System.out.print("Enter puppy emotion: ");
        p.getEmotion(sc.nextLine());

      // Calling from Animal class
      
        p.eat();  
      
      // Calling from Dog class
      
        p.bark();  

      // Calling from Puppy class
      
        p.weep();  

        sc.close(); 
    }
}
