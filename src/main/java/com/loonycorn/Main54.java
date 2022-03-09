package com.loonycorn;

import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class Main54 {

    public static void main(String[] args){

        ApplicationContext context = AppContextWrapper54.getContext();

        Order myOrder = (Order) context.getBean("orderBean");

        myOrder.displayOrderItems();

    }
}