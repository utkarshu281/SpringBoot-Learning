package org.example.IOCDepenDencyInjection.notification;

public class SmsService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("sms notification has been sent");
    }
}
