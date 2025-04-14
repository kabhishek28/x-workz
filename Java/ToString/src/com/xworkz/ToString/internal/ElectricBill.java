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
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ElectricBill) {
                ElectricBill other = (ElectricBill) object;
                if (this.consumerName.equals(other.consumerName) &&
                        this.units == other.units &&
                        this.totalAmount == other.totalAmount) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
