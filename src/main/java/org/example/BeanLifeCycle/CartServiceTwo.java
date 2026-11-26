package org.example.BeanLifeCycle;

import java.util.HashMap;
import java.util.Map;

public class CartServiceTwo {
    Map<Integer,String> map;
    public CartServiceTwo(){
        map = new HashMap<>();
        System.out.println("CartServiceTwo created");
    }
    public void start() {
        map.put(1,"Utkarsh");
        map.put(2,"Krishna");
        System.out.println("Bean is ready");
    }
    public void stop(){
        map.clear();
        System.out.println("Bean is getting destroyed");
    }
    public String getValue(Integer key){
        return map.get(key);
    }

}
