package com.xworkz.ToString.internal;

public class NightTrail {
    private String location;
    private boolean fullMoon;
    private int participants;

    public NightTrail(String location, boolean fullMoon, int participants) {
        this.location = location;
        this.fullMoon = fullMoon;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Location: " + location + ", Full Moon: " + fullMoon + ", Participants: " + participants;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
