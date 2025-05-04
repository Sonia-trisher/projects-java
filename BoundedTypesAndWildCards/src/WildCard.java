

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
//        list.of it mean nothing you can change or add
        List<Integer> listOfIntegers = List.of(1,2,3);
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hope");
        listOfStrings.add("Milli");

        printList(listOfStrings);
        printList(listOfIntegers);

    }
// ? you don't know type of data type
    public static void printList(List<?> list) {
        for (Object item: list) {
            System.out.println(item);
        }
//        thi sout is for to put space between
        System.out.println();
    }
}
