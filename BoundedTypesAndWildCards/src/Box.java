// bounded
public class Box <T extends Number>{
    private T value;

    public Box(T value) {

        this.value = value;
    }
    public T getValue() {

        return value;
    }
}
