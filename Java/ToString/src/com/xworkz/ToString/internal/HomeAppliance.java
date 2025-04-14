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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof HomeAppliance) {
                HomeAppliance other = (HomeAppliance) object;
                if (this.applianceName.equals(other.applianceName) &&
                        this.brand.equals(other.brand) &&
                        this.powerWatts == other.powerWatts) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
