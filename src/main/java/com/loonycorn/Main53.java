package com.loonycorn;

import com.loonycorn.aopadvices.Order;
import org.springframework.context.ApplicationContext;

public class Main53 {

    public static void main(String[] args){

        ApplicationContext context = AppContextWrapper53.getContext();

        Order myOrder = (Order) context.getBean("orderBean");

        myOrder.getOrderItems().clear();

        myOrder.displayOrderItems();

    }
}

