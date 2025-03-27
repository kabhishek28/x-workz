package com.xworkz.A_relations.internal;

public class Capacitor {
    private int powerConsumption;
    private int currentRating;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setCurrentRating(int currentRating) {
        this.currentRating = currentRating;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getCurrentRating() {
        return currentRating;
    }
}

