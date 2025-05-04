public class Main {
        public static void main(String[] args) {
            Dog.info();             // ✅ static call — no Dog object needed
            Dog.describeDogs();
            Dog d = new Dog();      // ✅ creating object
            d.bark();// ✅ instance method call — needs object
            d.bark2();





            // Static method → No object needed
            System.out.println(MathTool.add(5, 2));

            // Instance method → Needs object
            MathTool tool = new MathTool();
            tool.sayHi();
        }


}
