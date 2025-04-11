package com.xworkz.ToString.internal;

public class Temple {
    private String name;
    private String location;
    private boolean isOpen;

    public Temple(String name, String location, boolean isOpen) {
        this.name = name;
        this.location = location;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "Temple: " + name + ", Location: " + location + ", Open: " + isOpen;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner

