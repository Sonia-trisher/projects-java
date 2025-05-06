import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        mutable list you can not add any number or value
       List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//       unmuatable ( you can add value)
//        List<Integer> numbers = List.of(1,2,3,4,5);
        List< Integer> doubleNumbers = numbers.stream()
                .map(n->n*2)
                .toList();
        System.out.println(doubleNumbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n->n%2 ==0)
                .toList();
        System.out.println(evenNumbers);

        List<String> names = Arrays.asList("keza","ange","sonia","moses","queen","hope");
        List<String> arrangeNames = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .filter(name ->name.length() ==4)
                .toList();
        System.out.println("Sorted list ascending order: "+arrangeNames);
        List<String> arrangeNamesDesc = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted list descending order: "+arrangeNamesDesc);

        List<Integer> grades = Arrays.asList(1,2,3,4,5);
        int sum = grades.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of grades: "+sum);
    }
}
