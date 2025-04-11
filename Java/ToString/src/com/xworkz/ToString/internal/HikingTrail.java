package com.xworkz.ToString.internal;

public class HikingTrail {
    private String trailName;
    private int lengthKm;
    private boolean dogFriendly;

    public HikingTrail(String trailName, int lengthKm, boolean dogFriendly) {
        this.trailName = trailName;
        this.lengthKm = lengthKm;
        this.dogFriendly = dogFriendly;
    }

    @Override
    public String toString() {
        return "Trail: " + trailName + ", Length: " + lengthKm + " km, Dog Friendly: " + dogFriendly;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
