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

    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof InventoryItem) {
                InventoryItem other = (InventoryItem) object;
                if (this.itemName.equals(other.itemName) &&
                        this.price == other.price) {
                    return true;
                }
            }
        }
        return false;
    }
}
