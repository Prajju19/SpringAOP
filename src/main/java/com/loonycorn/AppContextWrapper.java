package com.loonycorn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextWrapper {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext51.xml");

    private AppContextWrapper(){}

    public static ApplicationContext getContext(){
        return context;
    }
}

