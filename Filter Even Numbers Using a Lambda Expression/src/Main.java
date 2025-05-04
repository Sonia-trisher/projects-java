import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List: " + input);
        List<Integer> even = EvenNumberFilter.filterEvenNumbers(input);
        System.out.println("Even numbers List: " + even);

        List<Integer> input2 = List.of();
        System.out.println("original List: " + input2);
        List<Integer> even2 = EvenNumberFilter.filterEvenNumbers(input2);
        System.out.println("Even numbers List: " + even2);

        List<Integer> input3 = List.of(1,3,5,7,9);
        System.out.println("original List: " + input3);
        List<Integer> even3 = EvenNumberFilter.filterEvenNumbers(input3);
        System.out.println("Even numbers List: " + even3);

    }
}
