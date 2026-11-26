package org.example.BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // UserService userService = context.getBean(UserService.class);
        //userService.setBeanName("Utkarsh");
        /*we cannot chnage bean name we are just calling a function*/
        //CartService cartService = context.getBean(CartService.class);
        CartServiceThree cartService = context.getBean(CartServiceThree.class);
        System.out.println(cartService.getValue(1));

        context.close();//for calling Destruction callbacks before program get closed
    }
}
