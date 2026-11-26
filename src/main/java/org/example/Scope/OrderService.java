package org.example.Scope;
import org.springframework.context.annotation.Lazy;


public class OrderService {
    PaymentService paymentService;
    OrderService(@Lazy PaymentService paymentService){
        /*the @Lazy keyword in method states that:-
        do not inject dependencies yet and until then pass a proxxy
        object*/
        this.paymentService = paymentService;
        System.out.println("Object od order service is created");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("order has been placed");
    }
}







