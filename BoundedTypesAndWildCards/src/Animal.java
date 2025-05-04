import java.util.ArrayList;
import java.util.List;
public class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}
// Subclass
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

