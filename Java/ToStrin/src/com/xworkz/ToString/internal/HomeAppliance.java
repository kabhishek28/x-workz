package com.xworkz.ToString.internal;

public class HomeAppliance {
    private String applianceName;
    private String brand;
    private int powerWatts;

    public HomeAppliance(String applianceName, String brand, int powerWatts) {
        this.applianceName = applianceName;
        this.brand = brand;
        this.powerWatts = powerWatts;
    }

    @Override
    public String toString() {
        return "Appliance: " + applianceName + ", Brand: " + brand + ", Power: " + powerWatts + "W";
    }
}

    // Runner
