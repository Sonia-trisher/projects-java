package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        List<String> guests = Arrays.asList("sonia","keza","tessy");

//        consumer tell us to do one thing like here is sending invitation
//        it is like robot you tell thing do this Send emails ,Print tickets
        Consumer<String> invite = guest -> System.out.println("Dear " + guest + ", you're invited.");
//        guests.forEach(invite);
        for (String guest : guests) {
            invite.accept(guest);
        }
    }

}
