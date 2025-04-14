package com.xworkz.ToString.internal;

public class DeliveryPerson {
    private String name;
    private String zone;
    private boolean onDuty;

    public DeliveryPerson(String name, String zone, boolean onDuty) {
        this.name = name;
        this.zone = zone;
        this.onDuty = onDuty;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Zone: " + zone + ", On Duty: " + onDuty;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof DeliveryPerson) {
                DeliveryPerson other = (DeliveryPerson) object;
                if (this.name.equals(other.name) &&
                        this.zone.equals(other.zone) &&
                        this.onDuty == other.onDuty) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner

