package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.AutonomousVehicle;

public class SelfDrivingCar implements AutonomousVehicle {
    @Override
    public void startNavigation() {
        System.out.println("Self-driving car starting navigation.");
    }

    @Override
    public void avoidObstacles() {
        System.out.println("Self-driving car detecting and avoiding obstacles.");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Self-driving car stopping navigation safely.");
    }
}