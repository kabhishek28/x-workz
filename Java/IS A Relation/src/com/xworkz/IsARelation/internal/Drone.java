package com.xworkz.IsARelation.internal;

public class Drone {
    public Drone() {
        System.out.println("No-argument constructor: Drone");
    }

    public void takeOff() {
        System.out.println("Drone is taking off");
    }

    public void land() {
        System.out.println("Drone is landing");
    }

    public void hover() {
        System.out.println("Drone is hovering in the air");
    }

    public void captureVideo() {
        System.out.println("Drone is capturing video");
    }

    public void batteryStatus() {
        System.out.println("Checking drone battery status");
    }
}
