package com.xworkz.ToString.internal;

public class ForestTrail {
    private String forestName;
    private int trailCount;
    private boolean hasWildlife;

    public ForestTrail(String forestName, int trailCount, boolean hasWildlife) {
        this.forestName = forestName;
        this.trailCount = trailCount;
        this.hasWildlife = hasWildlife;
    }

    @Override
    public String toString() {
        return "Forest: " + forestName + ", Trails: " + trailCount + ", Wildlife: " + hasWildlife;
    }
    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
