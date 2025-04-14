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
    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof CampingSite) {
                CampingSite other = (CampingSite) object;
                if (this.siteName.equals(other.siteName) &&
                        this.location.equals(other.location)) {
                    return true;
                }
            }
        }
        return false;
    }
}

