package com.loonycorn;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectConfig6 {

    @Pointcut("@annotation(com.loonycorn.pointcuts.DetailPublisher)")
    private void myPointcutMethod() { }

    @Before("myPointcutMethod()")
    public void beforeAdvice(JoinPoint jp) {

        System.out.println("\n[Before Advice]: This advice is executed before the execution of the below method..");
        System.out.println("From AspectConfig.beforeAdvice() : Executing " + jp.getSignature().getName() );
    }
}
