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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof HikingTrail) {
                HikingTrail other = (HikingTrail) object;
                if (this.trailName.equals(other.trailName) &&
                        this.lengthKm == other.lengthKm &&
                        this.dogFriendly == other.dogFriendly) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
