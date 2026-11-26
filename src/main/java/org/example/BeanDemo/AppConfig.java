package org.example.BeanDemo;

import org.example.BeanDemo.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppConfig {
    /*IoC container m do beans create ho jayenge pr milega aapko ek hi
    * hr baaar same hi object milega per bean defination(Singleton classes)
    *
    * */
    @Bean
    public OrderService order(){
        return new OrderService();
    }
    @Bean
    public OrderService order2(){
        return new OrderService();
    }
}
