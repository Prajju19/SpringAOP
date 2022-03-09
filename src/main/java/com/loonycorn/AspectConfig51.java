package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class AspectConfig51 {

    private Order getOrder(){

        ApplicationContext context = AppContextWrapper.getContext();

        return (Order) context.getBean("orderBean");
    }

    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: " + jp.getSignature().getName());

        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");
    }

    public void printOrderValue(){

        Order order = getOrder();
        System.out.println("\n====================================");
        System.out.println("Order Total: $" + order.getOrderValue());
        System.out.println("====================================\n");
    }

}
