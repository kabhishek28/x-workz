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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Tourist) {
                Tourist other = (Tourist) object;
                if (this.name.equals(other.name) &&
                        this.country.equals(other.country) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
