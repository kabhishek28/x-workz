package com.xworkz.IsARelation.internal;

public class Spacecraft {
    public Spacecraft() {
        System.out.println("No-argument constructor: Spacecraft");
    }

    public void launch() {
        System.out.println("Spacecraft is launching");
    }

    public void orbit() {
        System.out.println("Spacecraft is in orbit");
    }

    public void land() {
        System.out.println("Spacecraft is landing");
    }

    public void communicate() {
        System.out.println("Spacecraft is communicating with ground control");
    }

    public void fuelType() {
        System.out.println("Spacecraft uses rocket fuel");
    }
}
