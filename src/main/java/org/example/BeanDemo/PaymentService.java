package org.example.BeanDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // object will only be created when it is asked for not ao Ioc Container gets started
public class PaymentService {
    PaymentService() {
        System.out.println("Payment Service has been created");
    }
}
