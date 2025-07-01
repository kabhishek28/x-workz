package com.xworkz.ToString.internal;

public class TravelPackage {
    private String packageName;
    private String destination;
    private int days;

    public TravelPackage(String packageName, String destination, int days) {
        this.packageName = packageName;
        this.destination = destination;
        this.days = days;
    }

    @Override
    public String toString() {
        return "Package: " + packageName + ", Destination: " + destination + ", Duration: " + days + " days";
    }
}
