package com.loonycorn.pointcuts;

import java.util.List;

public class ItemList1 {

    List<Item1> items;

    public List<Item1> getItems() {
        return items;
    }

    public void setItems(List<Item1> items) {
        this.items = items;
    }

    public void printNumItems() {

        System.out.println("\n*---- Method: ItemList.printNumItems() has been called ----*");
        System.out.println("There are " + items.size() + " items in total.");
    }
    public void displayItemList() {

        System.out.println("\n*---- Method: ItemList.displayItemList() is called ----*");

        String format = "|%1$-8s|%2$-16s|%3$-16s|%4$-16s|\n";
        System.out.println("-----------------------------------------------------------------");
        System.out.format(format, "ITEM ID", "ITEM NAME", "ITEM PRICE", "QUANTITY");
        System.out.println("-----------------------------------------------------------------");

        for(Item1 item : items) {
            System.out.format(format,
                    item.getItemId(), item.getItemName(),
                    item.getItemPrice(), item.getAvailableQuantity());
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public void addItemToList(Item1 item){
        this.items.add(item);
    }

    public void addItemToListAtIndex(int index, Item1 item){
        this.items.add(index, item);
    }
}
