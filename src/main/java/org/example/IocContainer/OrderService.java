package org.example.IocContainer;

import org.example.IocContainer.PaymentService.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
* IoC container automatically create Beans(objects handeled by spring framework) and
* also automate the operation of dependency injection
* the annotation Component tells spring frame that you handle the object of this class
* */
@Component
public class OrderService {
    //@Autowired // Filed Injection :- not recommended
    private PaymentService ps;
    /*
    *  AutoWired :- automatic Dependency Injection (DI)
    * it find the beans class need and provide at the runtime
    * */
    @Autowired
    public //Constructor injection :- most recommended approach
    OrderService(@Qualifier("cardPayment") PaymentService ps){
        //if we have only one constructor we can remove AutoWired
        this.ps=ps;
    }
    public void placeOrder() {
        ps.pay();
        System.out.println("order has been palced ");
//    }
//    @Autowired //setter injection :- in setter injection we NEED to apply autoWired to tell spring to call otherwise it will give error
//    public void setPaymentService(PaymentService ps){
//        this.ps=ps;
//    }
    }
}
