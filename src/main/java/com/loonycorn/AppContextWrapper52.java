package com.loonycorn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextWrapper52 {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext52.xml");

    private AppContextWrapper52(){}

    public static ApplicationContext getContext(){
        return context;
    }
}
