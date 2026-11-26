package org.example.IOCDepenDencyInjection;

import org.example.IOCDepenDencyInjection.notification.NotificationService;
import org.example.IOCDepenDencyInjection.notification.PopUpNotification;

/*
* 1)solid principle
* 2)Design pattern
* 3)web should code in java for interfaces
* */
public  class Main {
    public static void main(String[] args) {
        NotificationService notification = new PopUpNotification();
        OrderService order = new OrderService(notification);//dependency injection by constructor
        order.orderPlaced();
        order.setNotification(notification);//dependency injection by setter
        /*another way is field injection(not recommended) it is done through instance variable but
        * instance variable should be private  */
    }
}
/*A class should ask what it needs and should not build everything by itself*/
