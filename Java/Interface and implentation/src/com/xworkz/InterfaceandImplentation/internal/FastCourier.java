package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.CourierService;

public class FastCourier implements CourierService {
    @Override
    public void pickUpPackage() {
        System.out.println("Picking up the package from the sender.");
    }

    @Override
    public void trackPackage() {
        System.out.println("Tracking the package in transit.");
    }

    @Override
    public void deliverPackage() {
        System.out.println("Delivering the package to the recipient.");
    }
}