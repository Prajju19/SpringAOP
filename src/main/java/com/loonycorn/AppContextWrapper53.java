package com.loonycorn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextWrapper53 {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext53.xml");

    private AppContextWrapper53(){}

    public static ApplicationContext getContext(){
        return context;
    }
}

