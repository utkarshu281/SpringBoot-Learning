package org.example.BeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/*all Aware interface are functional interfaces */
//@Component("userBean")//bean name
public class UserService implements BeanNameAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name) {
        //callback method-->spring will call this method
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context "+ applicationContext.getApplicationName());

    }
}
