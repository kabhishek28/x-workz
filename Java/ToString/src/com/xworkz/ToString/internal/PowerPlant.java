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
}
