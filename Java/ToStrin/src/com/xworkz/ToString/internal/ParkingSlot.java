package com.xworkz.ToString.internal;

public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleType;

    public ParkingSlot(String slotId, boolean isOccupied, String vehicleType) {
        this.slotId = slotId;
        this.isOccupied = isOccupied;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Slot: " + slotId + ", Occupied: " + isOccupied + ", Vehicle Type: " + vehicleType;
    }
}

    // Runner


