package org.example.BeanLifeCycle;

import org.example.BeanLifeCycle.PaymentService;

public class OrderService {
    private final PaymentService paymentService;
    OrderService(PaymentService paymentService) {
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("order has been placed");
    }
}
