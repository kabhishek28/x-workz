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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ParkingSlot) {
                ParkingSlot other = (ParkingSlot) object;
                if (this.slotId.equals(other.slotId) &&
                        this.vehicleType.equals(other.vehicleType) &&
                        this.isOccupied == other.isOccupied) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner


