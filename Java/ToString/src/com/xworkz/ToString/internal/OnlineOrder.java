package com.xworkz.ToString.internal;

public class OnlineOrder {
    private String orderId;
    private String itemName;
    private double amount;

    public OnlineOrder(String orderId, String itemName, double amount) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Item: " + itemName + ", Amount: ₹" + amount;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof OnlineOrder) {
                OnlineOrder other = (OnlineOrder) object;
                if (this.orderId.equals(other.orderId) &&
                        this.itemName.equals(other.itemName) &&
                        this.amount == other.amount) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

