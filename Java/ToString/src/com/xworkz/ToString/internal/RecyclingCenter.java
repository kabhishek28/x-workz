package com.xworkz.ToString.internal;

public class RecyclingCenter {
    private String city;
    private int plasticKg;
    private boolean acceptsElectronics;

    public RecyclingCenter(String city, int plasticKg, boolean acceptsElectronics) {
        this.city = city;
        this.plasticKg = plasticKg;
        this.acceptsElectronics = acceptsElectronics;
    }

    @Override
    public String toString() {
        return "City: " + city + ", Plastic Collected: " + plasticKg + "kg, Electronics: " + acceptsElectronics;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof RecyclingCenter) {
                RecyclingCenter other = (RecyclingCenter) object;
                if (this.city.equals(other.city) &&
                        this.plasticKg == other.plasticKg &&
                        this.acceptsElectronics == other.acceptsElectronics) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
