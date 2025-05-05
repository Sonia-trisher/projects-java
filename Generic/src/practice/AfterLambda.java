package practice;

public class AfterLambda {
    public static void main(String[] args) {
        Greeter peopleGreeter = (name) ->System.out.println("Hello " + name);
        Greeter aiGreeter = (name) ->System.out.println("Hello " + name);
        Greeter greeter = (name) ->System.out.println("byee " + name);
        peopleGreeter.greet("keza");
        aiGreeter.greet("chatGPT");
        greeter.greet("sonia");

    }
}
