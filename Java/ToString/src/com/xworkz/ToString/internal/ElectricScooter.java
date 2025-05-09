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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ElectricScooter) {
                ElectricScooter other = (ElectricScooter) object;
                if (this.company.equals(other.company) &&
                        this.range == other.range &&
                        this.hasBluetooth == other.hasBluetooth) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
