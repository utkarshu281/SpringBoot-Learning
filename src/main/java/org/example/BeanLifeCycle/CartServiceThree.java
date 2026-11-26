package org.example.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component("UtkarshKaBean")
public class CartServiceThree implements BeanNameAware, ApplicationContextAware {
    Map<Integer,String> map;
    public CartServiceThree(){
        map = new HashMap<>();
        System.out.println("CartServiceTwo created");
    }
    @PostConstruct//most used initializing method
    public void start() {
        map.put(1,"Utkarsh");
        map.put(2,"Krishna");
        System.out.println("Bean is ready");
    }
    @PreDestroy
    public void stop(){
        map.clear();
        System.out.println("Bean is getting destroyed");
    }
    public String getValue(Integer key){
        return map.get(key);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is: "+ name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context "+ /*applicationContext.getApplicationName()*/ 23);
    }
}
