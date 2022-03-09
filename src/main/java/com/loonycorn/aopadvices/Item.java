package com.loonycorn.aopadvices;

public class Item {
    int itemId;
    String itemName;
    float itemPrice;
    int availableQuantity;

    public Item() {
    }

    public Item(int itemId, String itemName, float itemPrice, int availableQuantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
