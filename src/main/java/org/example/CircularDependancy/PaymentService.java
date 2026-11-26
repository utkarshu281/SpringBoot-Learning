package org.example.CircularDependancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private OrderService orderService;
    @Autowired
    PaymentService(OrderService orderService){
        this.orderService=orderService;
    }
    public void pay(){
        System.out.println("order has been placed");
        //not it's responsibility
        //orderService.getOrderDetails();
    }
}
