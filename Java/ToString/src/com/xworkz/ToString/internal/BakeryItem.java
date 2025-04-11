package com.xworkz.ToString.internal;

public class BakeryItem {
    private String itemName;
    private String flavor;
    private double price;

    public BakeryItem(String itemName, String flavor, double price) {
        this.itemName = itemName;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Flavor: " + flavor + ", Price: ₹" + price;
    }
    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
