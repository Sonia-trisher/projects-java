import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Box1<String> box = new Box1<>("PHONE");
        System.out.println(box.getObject());

//        List<String> fruits = List.of("Apple", "Banana", "cherry");
//        fruits.forEach(System.out::println);
        List<String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("cherry");
        System.out.println(fruits1);
        Sum add= (a,b)->a+b;
        int result= add.sum(8,4);
        System.out.println(result);
        Person person = (name) -> System.out.println("hy "+ name);
        person.getName("sonia");
    }
}

 interface Person {
    void getName( String name );
}




