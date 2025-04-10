package com.xworkz.ToString.internal;

public class TrailGuide {
    private String guideName;
    private int yearsExperience;
    private boolean certified;

    public TrailGuide(String guideName, int yearsExperience, boolean certified) {
        this.guideName = guideName;
        this.yearsExperience = yearsExperience;
        this.certified = certified;
    }

    @Override
    public String toString() {
        return "Guide: " + guideName + ", Experience: " + yearsExperience + " yrs, Certified: " + certified;
    }
}

    // Runner


