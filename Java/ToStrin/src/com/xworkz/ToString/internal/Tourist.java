package com.xworkz.ToString.internal;

public class Tourist {
    private String name;
    private String country;
    private int placesVisited;

    public Tourist(String name, String country, int placesVisited) {
        this.name = name;
        this.country = country;
        this.placesVisited = placesVisited;
    }

    @Override
    public String toString() {
        return "Tourist: " + name + ", From: " + country + ", Places Visited: " + placesVisited;
    }
}
