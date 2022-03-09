package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class AspectConfig53 {

    private Order getOrder(){

        ApplicationContext context = AppContextWrapper53.getContext();

        return (Order) context.getBean("orderBean");
    }

    public void printLogo(ProceedingJoinPoint pjp) throws Throwable{

        System.out.println("\n\nLogo printed before invocation of: " + pjp.getSignature().getName());
        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");

        Order order = getOrder();
        pjp.proceed();

        System.out.println("\nThe number of items in your order: " + order.getOrderItems().size());

    }

    public void printOrderValue(){

        Order order = getOrder();
        System.out.println("\n====================================");
        System.out.println("Order Total: $" + order.getOrderValue());
        System.out.println("====================================\n");
    }

    public void logException(JoinPoint jp, Throwable ex){

        System.out.println("An exception has been thrown when running " + jp.getSignature());
        System.out.println("Exception message: " + ex.getMessage() + "\n\n");
    }

}
