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
}

    // Runner

