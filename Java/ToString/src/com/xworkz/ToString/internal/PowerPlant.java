package com.xworkz.ToString.internal;

public class PowerPlant {
    private String name;
    private String type;
    private int capacity;

    public PowerPlant(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Power Plant: " + name + ", Type: " + type + ", Capacity: " + capacity + " MW";
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof PowerPlant) {
                PowerPlant other = (PowerPlant) object;
                if (this.name.equals(other.name) &&
                        this.type.equals(other.type) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
