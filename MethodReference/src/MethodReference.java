import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
//        reference to static
        List<String> names = Arrays.asList("John", "Mary", "Jane");
//        The first uses a lambda
        names.forEach( name -> System.out.println(name));
//        method reference(static)
        // Synthax: ClassName::staticMethodName
//        names.forEach(System.out::println);

//            Math.max() is static
        int max =Math.max(5,10);
        System.out.println( max);
//        length() is an instance method
            String name = "John";
            int length = name.length();
        System.out.println(length);

        Greeter salute = new Greeter();
        List<String> people =List.of("John", "Mary", "Jane");
//        people.forEach(person -> salute.greet(person));
        // Syntax: objectReference::instanceMethodName
        people.forEach(salute::greet);

        List<String> team = Arrays.asList("Yvette", "Milli","Florence", "Gloria", "Christine", "Louise");
        team.sort(String::compareTo);
        System.out.println(team);
//        lambda expression
//        team.sort((t1,t2) -> t1. compareTo(t2));
        System.out.println("Sorted team: "+team);
        List<String> theBestSudents =Arrays.asList("Sonia", "Channelle", "Ingabire", "Queen", "Muhimpundu", "Anne", "Florence", "Mutuyimana", "Gaju");
        List<Person> theBest = theBestSudents.stream()
                .map(st ->new Person(st))
                .toList();
        System.out.println(theBest);

////        List<Person> theBest = theBestStudents.stream()
////                .map(Person::new)
////                .toList();
////        // Syntax: ClassName::new
//        System.out.println(theBest);
    }
}
