
    import java.util.ArrayList;
    import java.util.List;

    public class Main {
        public static void main(String[] args) {
            Box<Integer> integerBox = new Box<>(2);
            Box<Double> doubleBox = new Box<>(2.06);
            System.out.println(integerBox.getValue());
            System.out.println(doubleBox.getValue());
        //super from lower to upper like from integer,double to number

            List<Integer> integerList = new ArrayList<>();
            List<Number> numberList = new ArrayList<>();
            List<Object> objectList = new ArrayList<>();

            Main.addNumbers(integerList, 3);
            Main.addNumbers(numberList, 5);
            Main.addNumbers(objectList, 7);

            // Print each list to show what's inside
            System.out.println("Integer List: " + integerList);
            System.out.println("Number List: " + numberList);
            System.out.println("Object List: " + objectList);
        }

        public static void addNumbers(List<? super Integer> list, int a) {
            list.add(a);
//            list.get(a);// safely adds Integer
        }
    }


