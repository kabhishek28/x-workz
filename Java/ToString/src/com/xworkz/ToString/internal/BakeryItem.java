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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof BakeryItem) {
                BakeryItem other = (BakeryItem) object;
                if (this.itemName.equals(other.itemName) &&
                        this.flavor.equals(other.flavor) &&
                        this.price == other.price) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
