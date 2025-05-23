package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("email")(nizo ziri gutanga service on email)
//@Primary(this means nico kiri busohoke by default i mean iyo ushizeho primary uba uvuze ko ushak this option)
public class Email implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email : " + message);
    }
}
