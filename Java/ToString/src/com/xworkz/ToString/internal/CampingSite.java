package com.xworkz.ToString.internal;

public class CampingSite {
    private String siteName;
    private String location;
    private boolean hasWaterAccess;

    public CampingSite(String siteName, String location, boolean hasWaterAccess) {
        this.siteName = siteName;
        this.location = location;
        this.hasWaterAccess = hasWaterAccess;
    }

    @Override
    public String toString() {
        return "Camping Site: " + siteName + ", Location: " + location + ", Water Access: " + hasWaterAccess;
    }
}

