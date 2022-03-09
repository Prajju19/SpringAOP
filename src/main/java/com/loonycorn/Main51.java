package com.loonycorn;


import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class Main51 {

    public static void main(String[] args){

        ApplicationContext context = AppContextWrapper.getContext();

        Order myOrder = (Order) context.getBean("orderBean");

        myOrder.displayOrderItems();

    }
}