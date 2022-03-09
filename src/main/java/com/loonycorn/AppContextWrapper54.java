package com.loonycorn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContextWrapper54 {

    private static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    private AppContextWrapper54(){}

    public static ApplicationContext getContext(){
        return context;
    }
}
