package com.loonycorn;

import com.loonycorn.aopadvices.Item;
import com.loonycorn.aopadvices.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

@ComponentScan(basePackages = "com.loonycorn")
@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

    @Bean(name = "orderBean")
    public Order mainOrderBean(){

        Order order = new Order();
        order.setOrderId(1101);
        order.setOrderedBy("Bob Brenner");
        order.setOrderAddress("3077B Oak Ave, Seattle, WA");

        Item itemOne = new Item(101, "Milk", 3.25f, 5);
        Item itemTwo = new Item(102, "Bread", 8.25f, 10);

        Map<Item, Integer> cart = new HashMap<>();
        cart.put(itemOne, 2);
        cart.put(itemTwo, 5);

        order.setOrderItems(cart);

        return order;
    }

}

