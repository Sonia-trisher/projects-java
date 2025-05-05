import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Stream pipeline using method reference to convert to uppercase
        List<String> uppercased = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(uppercased);
    }
}
