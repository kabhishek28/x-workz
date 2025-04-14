package com.xworkz.ToString.internal;

public class TrafficSignal {
    private String location;
    private String currentColor;
    private int timerInSeconds;

    public TrafficSignal(String location, String currentColor, int timerInSeconds) {
        this.location = location;
        this.currentColor = currentColor;
        this.timerInSeconds = timerInSeconds;
    }

    @Override
    public String toString() {
        return "Signal at: " + location + ", Light: " + currentColor + ", Timer: " + timerInSeconds + " sec";
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof TrafficSignal) {
                TrafficSignal other = (TrafficSignal) object;
                if (this.location.equals(other.location) &&
                        this.currentColor.equals(other.currentColor)) {
                    return true;
                }
            }
        }
        return false;
    }
}

