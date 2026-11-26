package org.example.CircularDependancy;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;
    /*
    * this will create circular dependency(paymentService dpends on OrderService and
    * OrderService depends on PaymentService. for now in spring core we can resolve this
    * problem with Field Or Setter injection, however it is not recommended to use and springBoot entirely
    * discourages it
    * spring.main.allow-circular-reference:false
    * either we change it to true and their are many ways we can resolve circular dependency
    * but it is a good coding practice(code is tightly coupled)
    * to refactor the writtern code and avoid circular dependency at all cost
    * */
    OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        getOrderDetails();
        System.out.println("order has been placed");
    }
    public void getOrderDetails(){
        System.out.println("order details");
    }
}
