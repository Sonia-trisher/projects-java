public class Main2 {
        public static void main(String[] args) {
            // 1. Using static method
            int result = Calculator.add(3, 4);  // ✅ No object needed
            System.out.println("Sum is: " + result);

            // 2. Using instance method
            Calculator calc = new Calculator(); // ✅ Create an object
            calc.greet("Alice");                // Call method on object
        }

}
