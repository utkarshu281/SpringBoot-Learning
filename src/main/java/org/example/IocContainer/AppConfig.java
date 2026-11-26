package org.example.IocContainer;

import in.Utkarsh.CartService;
import org.example.IocContainer.PaymentService.CardPayment;
import org.example.IocContainer.PaymentService.PaymentService;
import org.example.IocContainer.PaymentService.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*componentScan annotation which means ki java/spring search iss package k anadr jo mene provide kia h
* usme kis kise class k uppr component likha hai and jinke uppr likha hai vo class tumhari hui and ab
* unk tum handle karo*/
@Configuration//to tell spring that this is a configuration class
@ComponentScan("org.example.IocContainer")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Utkarsh",21);
    }
    @Bean
    public CartService createCartService(){
        return new CartService();
    }
    @Bean
    //@Primary
    @Qualifier
    public PaymentService createCard(){
        return new CardPayment();
    }
    @Bean
    @Qualifier
    public PaymentService createUPIPayment(){
        return new UpiPayment();
    }
    @Bean
    public OrderService createOrderService(@Qualifier("upiPayment") PaymentService paymentService){
        return new OrderService(paymentService);
    }


}
