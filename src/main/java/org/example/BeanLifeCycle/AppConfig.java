package org.example.BeanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    //@Bean(initMethod = "start",destroyMethod = "stop")
    public CartServiceTwo getCartServiceTwo() {
        return new CartServiceTwo();
    }
}
