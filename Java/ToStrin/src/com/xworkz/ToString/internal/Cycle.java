package com.xworkz.ToString.internal;

public class Cycle {
    private String brand;
    private int gearCount;
    private boolean isElectric;

    public Cycle(String brand, int gearCount, boolean isElectric) {
        this.brand = brand;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Cycle: " + brand + ", Gears: " + gearCount + ", Electric: " + isElectric;
    }
}
