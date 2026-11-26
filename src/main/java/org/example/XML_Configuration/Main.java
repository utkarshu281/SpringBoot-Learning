package org.example.XML_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*Ioc container(ApplicationContext) will try to locate this file in classPath which is located inside
        *the maven handle classpath files in resources.so, the location of xml file is in resources*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderService order = context.getBean(OrderService.class);//old method
        //get Bean by id
        OrderService order2 = (OrderService) context.getBean("orderService"); //new method, in constructor i have passed id of bean which is unique
        /*however in the ase of more than one bean in xml file(same concept as @Bean)
        * this OrderService order = context.getBean(OrderService.class) will break in prod
        * OrderService order = context.getBean(OrderService.class);
        * however if we want to make this wor, we have to pass id or name too
        * OrderService order = context.getBean(""Id of bean,OrderService.class)
        *  */
        order.placeOrder();
    }
}
