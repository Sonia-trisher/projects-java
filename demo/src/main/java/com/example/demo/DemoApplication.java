package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {


//       ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
//       Notifier notifier = context.getBean(Notifier.class);
//       notifier.send("hello word");
        Notifier notifier = new Notifier(new Sms());
        notifier.send("Hello World");
        notifier.setService(new Email());
        notifier.send("Hello sonia");
    }

}
