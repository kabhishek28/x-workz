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
}

    // Runner
