package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

@Aspect
public class AspectConfig5 {

    @Pointcut("execution(* *.print*(..))")
    private void myPointcutMethod(){}

    @Pointcut("execution(* *(int, com.loonycorn.pointcuts.Item))")
    private void addPointcut(){}

    @Pointcut("within(com.loonycorn.pointcuts.ItemList)")
    private void itemListAllMethodsPointcut(){}

    @Pointcut("within(com.loonycorn.pointcuts.*)")
    private void anyMethodPointcut(){}

    @Before("myPointcutMethod()")
    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: " + jp.getSignature().getName());

        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");
    }

    @Before("addPointcut()")
    public void addMessage(JoinPoint jp){

        System.out.println("################### ADD ###################");
        System.out.println("Performing an add operation by invoking " + jp.getSignature().getName());
        System.out.println("Arguments supplied: " + Arrays.toString(jp.getArgs()) + "\n");
    }

    @Before("itemListAllMethodsPointcut()")
    public void itemListAccessMessage(JoinPoint jp){

        System.out.println("\n<<<<<<<<<< Item List accessed >>>>>>>>>>");
        System.out.println("Method accessed: " + jp.getSignature().getName() + "\n");
    }

    @Before("anyMethodPointcut()")
    public void anyMethodCalledMessage(JoinPoint jp){

        System.out.println("\n$$$$$$$$$$ Method accessed $$$$$$$$$$");
        System.out.println("Method accessed: " + jp.getSignature().getName() + "\n");
    }

}
