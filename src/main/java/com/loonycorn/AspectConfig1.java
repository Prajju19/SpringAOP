package com.loonycorn;

import org.aspectj.lang.JoinPoint;

public class AspectConfig1 {

    public void printLogo(JoinPoint jp) {

        System.out.println("\n\nLogo printed before invocation of: " + jp.getSignature().getName());

        System.out.println("\n***********************************\n" +
                "************ Q E N E L ************\n" +
                "***********************************");
    }
}
