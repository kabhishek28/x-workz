package com.xworkz.ToString.internal;

public class MuseumExhibit {
    private String exhibitName;
    private String period;
    private boolean isOnDisplay;

    public MuseumExhibit(String exhibitName, String period, boolean isOnDisplay) {
        this.exhibitName = exhibitName;
        this.period = period;
        this.isOnDisplay = isOnDisplay;
    }

    @Override
    public String toString() {
        return "Exhibit: " + exhibitName + ", Period: " + period + ", On Display: " + isOnDisplay;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
