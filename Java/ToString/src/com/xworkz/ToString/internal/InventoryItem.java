package com.xworkz.ToString.internal;

public class InventoryItem {
    private String itemName;
    private int quantity;
    private double price;

    public InventoryItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}
