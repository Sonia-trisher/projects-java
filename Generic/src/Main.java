public class Main {
    public static void main(String[] args) {
//        Box<Double> box = new Box<>();
//        box.setItem(8.87);
//        System.out.println(box.getItem());
        Product<String ,Double> product = new Product<>("apple",50.0);
        Product<String ,Integer> product2 = new Product<>("ticket",100);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }

}
