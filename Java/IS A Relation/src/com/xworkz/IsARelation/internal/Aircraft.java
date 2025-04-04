package com.xworkz.IsARelation.internal;

public class Aircraft {
    public Aircraft() {
        System.out.println("Aircraft Constructor");
    }

    public void takeOff() {
        System.out.println("Aircraft is taking off");
    }

    public void land() {
        System.out.println("Aircraft is landing");
    }

    public void fly() {
        System.out.println("Aircraft is flying");
    }

    public void refuel() {
        System.out.println("Aircraft is refueling");
    }

    public void communicateWithATC() {
        System.out.println("Aircraft is communicating with Air Traffic Control");
    }
}
