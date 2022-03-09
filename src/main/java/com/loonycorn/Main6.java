package com.loonycorn;

import com.loonycorn.pointcuts.Item1;
import com.loonycorn.pointcuts.ItemList1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");

        Item1 itemOne = (Item1) context.getBean("itemBean1");
        Item1 itemTwo = (Item1) context.getBean("itemBean2");

        ItemList1 myList = (ItemList1) context.getBean("listBean");

        myList.printNumItems();
        myList.displayItemList();

        System.out.println("\n=======================================");
        System.out.println("\nDisplaying the items one at a time...\n");
        itemOne.printItemDetails();
        itemTwo.printItemDetails();

    }
}
