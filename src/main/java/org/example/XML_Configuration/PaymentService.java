package org.example.XML_Configuration;

public class PaymentService {
    private String type;
    PaymentService(String type) {
        this.type=type;
    }
    public void pay() {
        System.out.println("Payment has been done");
    }
}
