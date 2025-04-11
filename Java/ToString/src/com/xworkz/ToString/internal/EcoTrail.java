package com.xworkz.ToString.internal;

public class EcoTrail {
    private String parkName;
    private boolean plasticAllowed;
    private String ecoRating;

    public EcoTrail(String parkName, boolean plasticAllowed, String ecoRating) {
        this.parkName = parkName;
        this.plasticAllowed = plasticAllowed;
        this.ecoRating = ecoRating;
    }

    @Override
    public String toString() {
        return "Park: " + parkName + ", Plastic Allowed: " + plasticAllowed + ", Rating: " + ecoRating;
    }


    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner

