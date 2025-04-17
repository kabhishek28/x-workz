package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.BikeSharing;

public class UrbanBikeShare implements BikeSharing {
    @Override
    public void unlockBike() {
        System.out.println("Bike unlocked for user.");
    }

    @Override
    public void trackUsage() {
        System.out.println("Tracking bike usage and route.");
    }

    @Override
    public void lockBike() {
        System.out.println("Bike locked after usage.");
    }
}