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


    @Override
    public int hashCode(){
        return 4;
    }
    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof DroneDelivery) {
                DroneDelivery other = (DroneDelivery) object;
                if (this.isDelivered == other.isDelivered &&
                        this.packageId.equals(other.packageId) &&
                        this.destination.equals(other.destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}



