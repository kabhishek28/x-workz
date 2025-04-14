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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ElectricVehicle) {
                ElectricVehicle other = (ElectricVehicle) object;
                if (this.model.equals(other.model) &&
                        this.rangeKm == other.rangeKm &&
                        this.fastCharging == other.fastCharging) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
