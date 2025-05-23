package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Notifier {
//    Email email;
//    Sms sms;
    private  NotificationService service  ;

//    @Autowired (this twoo work the same)
//    @Qualifier("")
//
// Constructor injection
    public Notifier( NotificationService service) {
        this.service = service;
//        email = new Email();
//        sms = new Sms();
    }
//    setter injection
    public void setService(NotificationService service) {
        this.service = service;
    }
    public void send(String message) {
//        email.sendNotification(message);
//        sms.sendNotification(message);
        service.sendNotification(message);

    }


}
