package com.xworkz.ToString.internal;

public class ThemePark {
    private String name;
    private int rides;
    private boolean waterPark;

    public ThemePark(String name, int rides, boolean waterPark) {
        this.name = name;
        this.rides = rides;
        this.waterPark = waterPark;
    }

    @Override
    public String toString() {
        return "Theme Park: " + name + ", Rides: " + rides + ", Water Park: " + waterPark;
    }
}

    // Runner
