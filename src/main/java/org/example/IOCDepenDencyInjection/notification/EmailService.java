package org.example.IOCDepenDencyInjection.notification;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("email Notification has been send");
    }

}
