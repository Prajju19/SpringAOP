package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class AspectConfig52 {

    private Order getOrder() {

        ApplicationContext context = AppContextWrapper52.getContext();

        return (Order) context.getBean("orderBean");
    }

    public void printLogo(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("\n\nLogo printed before invocation of: " + pjp.getSignature().getName());
        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");

        Order order = getOrder();
        if (!order.getOrderItems().isEmpty()) {
            System.out.format("There are %d items in the order.", order.getOrderItems().size());
            pjp.proceed();
            System.out.println("\n***********************************\n" +
                    "************ Q E N E L ************\n" +
                    "***********************************");
        }
        else {
            System.out.println("cart is empty");
        }

        System.out.println("\nThe number of items in your order: " + order.getOrderItems().size());

    }

    public void printOrderValue() {

        Order order = getOrder();
        System.out.println("\n====================================");
        System.out.println("Order Total: $" + order.getOrderValue());
        System.out.println("====================================\n");
    }
}






