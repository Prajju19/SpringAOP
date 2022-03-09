package com.loonycorn;

import com.loonycorn.pointcuts.Item;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Item item = (Item) context.getBean("itemBeanOne");
       item.printItemDetails();
    }
}
