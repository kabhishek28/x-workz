package com.xworkz.ToString.internal;

public class ElectricVehicle {
    private String model;
    private int rangeKm;
    private boolean fastCharging;

    public ElectricVehicle(String model, int rangeKm, boolean fastCharging) {
        this.model = model;
        this.rangeKm = rangeKm;
        this.fastCharging = fastCharging;
    }

    @Override
    public String toString() {
        return "EV Model: " + model + ", Range: " + rangeKm + "km, Fast Charging: " + fastCharging;
    }
}

    // Runner
