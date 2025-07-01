package com.xworkz.ToString.internal;

public class ElectricScooter {
    private String company;
    private int range;
    private boolean hasBluetooth;

    public ElectricScooter(String company, int range, boolean hasBluetooth) {
        this.company = company;
        this.range = range;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "Scooter: " + company + ", Range: " + range + "km, Bluetooth: " + hasBluetooth;
    }
}

    // Runner
