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

    @Override
    public boolean equals(Object object){
        if(object != null){
            if(object instanceof MountainTrail){
                MountainTrail mountainTrail = (MountainTrail) object;
                if(this.hasCamping == mountainTrail.hasCamping && this.mountainName.equals(mountainTrail.mountainName) && this.elevationGain == mountainTrail.elevationGain){
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
