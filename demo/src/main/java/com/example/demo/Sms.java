package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")

public class Sms implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS : " + message);
    }
}
