package org.example.IocContainer.PaymentService;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//give priority to card payment
public class UpiPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("payment by upi");
    }
}
