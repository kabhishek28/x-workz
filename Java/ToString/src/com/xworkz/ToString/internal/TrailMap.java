package com.xworkz.ToString.internal;

public class TrailMap {
    private String region;
    private int totalDistance;
    private int numberOfStops;

    public TrailMap(String region, int totalDistance, int numberOfStops) {
        this.region = region;
        this.totalDistance = totalDistance;
        this.numberOfStops = numberOfStops;
    }

    @Override
    public String toString() {
        return "Region: " + region + ", Distance: " + totalDistance + " km, Stops: " + numberOfStops;
    }
    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner

