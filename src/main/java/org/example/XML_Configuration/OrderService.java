package org.example.XML_Configuration;

public class OrderService {
    private PaymentService paymentService;
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService object has been created");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("order has been placed");
    }
    //dependency injection through setter
    public void setPaymentServiceBean(PaymentService ps) {
        this.paymentService =ps;
    }
}
