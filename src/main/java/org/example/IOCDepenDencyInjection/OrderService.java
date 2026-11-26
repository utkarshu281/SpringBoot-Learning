package org.example.IOCDepenDencyInjection;

import org.example.IOCDepenDencyInjection.notification.EmailService;
import org.example.IOCDepenDencyInjection.notification.NotificationService;

public class OrderService {
   private EmailService noti = new EmailService();
    /*the problem with this type of design it that now OrderExercise is entirely dependent on
    * EmailService
    *2)we have create objects for every time of notification, which is kind of bas design for the classes
    * which have same base work
    * solution:-
    * 1) we will create an interface for NotificationService and we will pass object of the service
    * from constructor
    * */
    private  NotificationService notification;
    OrderService(NotificationService notification) {
        this.notification = notification;
    }
    public void orderPlaced(){
        System.out.println("oder has been Placed");
        //noti.sendNotification();
    }
    public void setNotification(NotificationService ns){
        this.notification=ns;
    }
}
