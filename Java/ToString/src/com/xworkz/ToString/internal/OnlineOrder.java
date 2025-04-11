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
}

    // Runner

