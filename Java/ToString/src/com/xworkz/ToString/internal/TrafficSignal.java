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
}

