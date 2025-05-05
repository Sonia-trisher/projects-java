import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number->number % 2==0)
                .collect(Collectors.toList());

//        public static List<Integer> filterMaxNumbers(List<Integer> numbers) {
//            return numbers.stream()
//                    .filter(number->number >=10)
//                    .collect(Collectors.toList());

//        List<Integer> evenNumbers = new ArrayList<>();
//        for (Integer number : numbers){
//            if (number % 2 == 0){
//                evenNumbers.add(number);
//            }
//        }
//
//        return evenNumbers;
    }
}
