package org.example.IocContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//ApplicationContext represents Ioc Container
public class Main {
    public static void main(String[] args) {
        /*annotation k configuration ko use krke spring container ko start karo
        * and hum container ko tab tak start nhi krsakte jab tak hum usko sab rules nhi batayenge and vo karenge hum
        * Annoataiton constructor k under apni khud ki config class ka reflection provide karo jo ki container ko
        * rules batayenge ki container ko beans kese handle karne hai
         */
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);//container OderService ka Bean lake dedega
        order.placeOrder();


    }
}
