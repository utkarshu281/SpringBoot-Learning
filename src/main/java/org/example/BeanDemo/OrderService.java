package org.example.BeanDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton") //by default scope of any class is singleton
/*if the scope is prototype ioc container won't handle it properly*/
public class OrderService {
    public OrderService(){
        System.out.println("Object of OrderService is created");
    }
    public void placeOrder(){
        System.out.println("order has been placed");
    }
}
