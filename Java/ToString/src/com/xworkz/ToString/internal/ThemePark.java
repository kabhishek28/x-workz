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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ThemePark) {
                ThemePark other = (ThemePark) object;
                if (this.name.equals(other.name) &&
                        this.rides == other.rides &&
                        this.waterPark == other.waterPark) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
