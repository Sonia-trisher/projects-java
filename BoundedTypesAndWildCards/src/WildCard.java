

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1,2,3);
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hope");
        listOfStrings.add("Milli");

        printList(listOfStrings);
        printList(listOfIntegers);

    }

    public static void printList(List<?> list) {
        for (Object item: list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
