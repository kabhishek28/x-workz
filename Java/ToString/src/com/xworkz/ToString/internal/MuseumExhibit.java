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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof MuseumExhibit) {
                MuseumExhibit other = (MuseumExhibit) object;
                if (this.exhibitName.equals(other.exhibitName) &&
                        this.period.equals(other.period) &&
                        this.isOnDisplay == other.isOnDisplay) {
                    return true;
                }
            }
        }
        return false;
    }
}


