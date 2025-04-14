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
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof TravelPackage) {
                TravelPackage other = (TravelPackage) object;
                if (this.destination.equals(other.destination) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
