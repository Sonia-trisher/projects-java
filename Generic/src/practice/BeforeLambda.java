package practice;
//function interface
public class BeforeLambda {
    public static void main(String[] args) {
        Greeter peopleGreeter = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello  " + name);
            }
        };
        Greeter aiGreater = new Greeter() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        aiGreater.greet("Gemini");
        peopleGreeter.greet("keza");
    }
}
