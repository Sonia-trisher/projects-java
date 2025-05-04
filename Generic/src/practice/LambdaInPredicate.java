package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaInPredicate {
    public static void main(String[] args) {
        List<String> fruits = Arrays. asList("apple", "banana", "orange","Cherry", "Date", "Water mellon", "Raspberry");
//        predicate is for checking if fruit is red if red this ROBOT of predicate it will say yes or no
//        "Hey robot! If the fruit is Apple, Water mellon, or Raspberry — say YES. Otherwise, say NO."
        Predicate<String> isRed = fruit -> fruit.equals("apple")||fruit.equals("Water mellon")||fruit.equals("Raspberry");
        for (String fruit : fruits) {
           if(isRed.test(fruit)) {
               System.out.println(fruit);
           }
        }

    }
}
