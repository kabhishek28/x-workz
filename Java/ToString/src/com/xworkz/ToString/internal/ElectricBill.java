package com.xworkz.ToString.internal;

public class ElectricBill {
    private String consumerName;
    private int units;
    private double totalAmount;

    public ElectricBill(String consumerName, int units, double totalAmount) {
        this.consumerName = consumerName;
        this.units = units;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Consumer: " + consumerName + ", Units: " + units + ", Amount: ₹" + totalAmount;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
