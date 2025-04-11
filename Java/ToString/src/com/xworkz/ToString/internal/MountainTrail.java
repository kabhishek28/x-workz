package com.xworkz.ToString.internal;

public class MountainTrail {
    private String mountainName;
    private int elevationGain;
    private boolean hasCamping;

    public MountainTrail(String mountainName, int elevationGain, boolean hasCamping) {
        this.mountainName = mountainName;
        this.elevationGain = elevationGain;
        this.hasCamping = hasCamping;
    }

    @Override
    public String toString() {
        return "Mountain: " + mountainName + ", Elevation Gain: " + elevationGain + "m, Camping: " + hasCamping;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
