import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        // Create lists
        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        // Add elements using wildcard method
        addDog(animalList); // Adds a Dog to List<Animal>
        addDog(dogList);    // Adds a Dog to List<Dog>

        // Print lists to show contents
        System.out.println("Animal List: " + animalList);
        System.out.println("Dog List: " + dogList);

        // Print eat behavior using wildcard method
        System.out.println("\nPrinting eat behaviors:");
        printAnimals(animalList); // Dog eats bones.
        printAnimals(dogList);    // Dog eats bones.
    }

    // Method to print eat behavior using ? extends Animal
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
        // animals.add(new Dog()); // Compilation error: Cannot add to List<? extends Animal>
    }

    // Method to add a Dog using ? super Dog
    public static void addDog(List<? super Dog> list) {
        list.add(new Dog());
        // Dog dog = list.get(0); // Compilation error: Cannot guarantee type Dog
    }
}
