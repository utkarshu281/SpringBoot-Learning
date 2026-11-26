package org.example.IOCDepenDencyInjection.notification;

public class PopUpNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("pop up notification has been send");
    }
}
