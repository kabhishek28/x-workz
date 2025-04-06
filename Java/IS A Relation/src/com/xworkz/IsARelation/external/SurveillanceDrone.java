package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Drone;

public class SurveillanceDrone extends Drone {

    public SurveillanceDrone() {
        System.out.println("No-argument constructor: SurveillanceDrone");
    }

@Override
    public void takeOff() {
        System.out.println("@Override :Drone is taking off");
    }
    @Override
    public void land() {
        System.out.println("@Override :Drone is landing");
    }
    @Override
    public void hover() {
        System.out.println("@Override :Drone is hovering in the air");
    }
    @Override
    public void captureVideo() {
        System.out.println("@Override :Drone is capturing video");
    }
    @Override
    public void batteryStatus() {
        System.out.println("@Override :Checking drone battery status");
    }
}
