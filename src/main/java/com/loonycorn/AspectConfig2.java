package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig2 {

    @Pointcut("execution(* com.loonycorn.pointcuts.Item.*(..))")
    private void myPointcutMethod(){}

    @Before("myPointcutMethod()")
    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: " + jp.getSignature().getName());

        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");
    }
}
