package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Aircraft;

public class PassengerPlane extends Aircraft {
    public PassengerPlane() {
        System.out.println("PassengerPlane Constructor");
    }

@Override
    public void takeOff() {
        System.out.println("@Override :Aircraft is taking off");
    }
    @Override
    public void land() {
        System.out.println("@Override :Aircraft is landing");
    }
    @Override
    public void fly() {
        System.out.println("@Override :Aircraft is flying");
    }
    @Override
    public void refuel() {
        System.out.println("@Override :Aircraft is refueling");
    }
    @Override
    public void communicateWithATC() {
        System.out.println("@Override :Aircraft is communicating with Air Traffic Control");
    }
}