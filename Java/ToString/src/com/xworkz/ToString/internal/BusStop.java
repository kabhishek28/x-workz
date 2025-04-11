package com.xworkz.ToString.internal;

public class BusStop {
    private String name;
    private String route;
    private boolean hasShelter;

    public BusStop(String name, String route, boolean hasShelter) {
        this.name = name;
        this.route = route;
        this.hasShelter = hasShelter;
    }

    @Override
    public String toString() {
        return "Stop: " + name + ", Route: " + route + ", Shelter: " + hasShelter;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

