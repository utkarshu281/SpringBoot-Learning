package org.example.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/*Initialization Callbacks:- this is kind of phase which can be achieved in three ways
(1)InitializationBean (2) init method (3) Post Construct Annotation
*this is tha phase which happens after objection creation and before depedencyInjection(verify this point)
in which spring calls your method, which you have specifically used to initialize stuff or perform
other task which is needed to done before any business logic
1)clearing cache
2)loading important data */
//@Component
public class CartService implements InitializingBean, DisposableBean {
    Map<Integer, String> mp;
    public CartService() {
        mp = new HashMap<>();
        System.out.println("yeahhh");
    }
    public void addToCart() {
        System.out.println("Added to Cart");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        mp.put(1,"Utkarsh");
        mp.put(2,"Krishna");
        System.out.println("Bean is ready");
    }
    public String getValue(Integer key){
        return mp.get(key);
    }

    @Override
    public void destroy() throws Exception {
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }
}
