package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.TrackingSystem;

public class FedExTrackingImpl {
    private TrackingSystem trackingSystem;

    public FedExTrackingImpl(TrackingSystem trackingSystem) {
        this.trackingSystem = trackingSystem;
    }

    public void checkPackageStatus() {
        if (trackingSystem != null) {
            trackingSystem.trackPackage();
        } else {
            System.out.println("TrackingSystem is null");
        }
    }
}

