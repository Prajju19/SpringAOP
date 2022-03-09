package com.loonycorn;

import com.loonycorn.pointcuts.Item;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Item item = (Item) context.getBean("itemBeanOne");

        System.out.println("The item created: \n" + item.toString());

        item.setAvailableQuantity(20);

        System.out.println("Updated available quantity: " + item.getAvailableQuantity());

    }
}
