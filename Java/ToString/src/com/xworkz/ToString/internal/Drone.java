package com.xworkz.ToString.internal;

public class Drone {
    private String model;
    private double flightTime;
    private boolean hasCamera;

    public Drone(String model, double flightTime, boolean hasCamera) {
        this.model = model;
        this.flightTime = flightTime;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString() {
        return "Drone Model: " + model + ", Flight Time: " + flightTime + " mins, Camera: " + hasCamera;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Drone) {
                Drone other = (Drone) object;
                if (this.model.equals(other.model) &&
                        this.flightTime == other.flightTime &&
                        this.hasCamera == other.hasCamera) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

