package org.example.BeanDemo;

import org.example.CircularDependancy.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /*when the container get started the classes which have Component and have singleton scope
        will initialize early that's called Eager initialization, meanwhile if the scope is Prototype
        the object will not be created when IoC container get a call--->Lazy
        . in prototype no all objects
        aare handled by IoC container
        * */
//        OrderService order = context.getBean(OrderService.class);
//        OrderService order2 = context.getBean(OrderService.class);
        //System.out.println(order2==order);//ioc container will provide the same object
        /*
        * this is due to Bean Scope
        * there are two type of Bean Scope
        * 1)Singleton
        * 2)prototype
        * in singleton scope ioc container will create only one object for one bean definition
        *
        *ques:- when should we use which one? singleton or prototype
        * singleton :- use for stateless classes
        * prototype :- use for stateful classes
        *
        * there are other scopes as welll other than singleton or prototype
        *--->Request ---> Session ---> Application
        * */
    }
}
