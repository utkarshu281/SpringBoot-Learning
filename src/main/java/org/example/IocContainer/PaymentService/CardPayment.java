package org.example.IocContainer.PaymentService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cp") //for changing the name of bean
public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("payment by card");
    }
}
