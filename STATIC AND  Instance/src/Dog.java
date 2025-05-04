public class Dog {

        public void bark() {         // ✅ instance method
            System.out.println("Woof!");
        }

        public static void info() {  // ✅ static method
            System.out.println("Dogs are cool!");
        }
         // Instance method - needs a Dog object
         public void bark2() {
        System.out.println("Woof! I am a dog.");
        }

        // Static method - belongs to the class, not one dog
        public static void describeDogs() {
        System.out.println("Dogs are friendly animals.");
        }


}
