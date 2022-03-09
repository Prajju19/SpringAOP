package com.loonycorn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.loonycorn.aopadvices.Order;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfig55 {

    private static final Logger log = LogManager.getLogger(AspectConfig.class);

    private Order getOrder(){

        ApplicationContext context = AppContextWrapper.getContext();

        return (Order) context.getBean("orderBean");
    }

    @Around("execution(* com.loonycorn.aopadvices.Order.displayOrderItems())")
    public void printLogo(ProceedingJoinPoint pjp) throws Throwable {

        log.info("Logo printed before invocation of: " + pjp.getSignature().getName());
        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");

        Order order = getOrder();
        pjp.proceed();

        System.out.println("\nThe number of items in your order: " + order.getOrderItems().size());

    }

    @AfterThrowing(pointcut = "execution(* com.loonycorn.aopadvices.Order.*(..))", throwing="ex")
    public void logException(JoinPoint jp, Throwable ex){

        log.error("An exception has been thrown when running " + jp.getSignature());
        log.error("Exception message: " + ex.getMessage() + "\n\n");
    }

    @AfterReturning(pointcut = "execution(* com.loonycorn.aopadvices.Order.displayOrderItems())")
    public void applyDiscount() throws InterruptedException{

        Order order = getOrder();

        System.out.println("\n====================================");
        System.out.println("Order Total: $" + order.getOrderValue());
        System.out.println("====================================\n");

        log.info("Order total calculated and displayed as " + order.getOrderValue());

        if(order.getOrderValue() > 25) {

            System.out.println("\n+++++++++++++++++++++++++++");
            System.out.println("Congratulations! You qualify for a discount!");
            System.out.println("Discounted Total: " + (0.9 * order.getOrderValue()));
            System.out.println("\n+++++++++++++++++++++++++++");

            log.info("Discounted total calculated and displayed as "
                    + (0.9 * order.getOrderValue()));
        }

    }

}
