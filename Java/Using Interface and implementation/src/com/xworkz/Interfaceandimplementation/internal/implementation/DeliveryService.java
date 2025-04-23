package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.TrackingSystem;

public class DeliveryService implements TrackingSystem {
    @Override
    public void trackPackage() {
        System.out.println("Delivery service tracks package using advanced tracking system.");
    }
}