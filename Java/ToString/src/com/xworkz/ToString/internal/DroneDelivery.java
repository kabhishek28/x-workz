package com.xworkz.ToString.internal;

public class DroneDelivery {
    private String packageId;
    private String destination;
    private boolean isDelivered;

    public DroneDelivery(String packageId, String destination, boolean isDelivered) {
        this.packageId = packageId;
        this.destination = destination;
        this.isDelivered = isDelivered;
    }


    @Override
    public String toString() {
        return "Package ID: " + packageId + ", Destination: " + destination + ", Delivered: " + isDelivered;
    }
}

    // Runner

