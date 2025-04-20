package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.Drone;
import com.xworkz.InterfaceandImplentation.RulesClass.SurveillanceSystem;

public class SurveillanceDrone implements Drone , SurveillanceSystem {
    @Override
    public void takeOff() {
        System.out.println("SurveillanceDrone taking off.");
    }

    @Override
    public void captureVideo() {
        System.out.println("SurveillanceDrone capturing aerial video.");
    }

    @Override
    public void land() {
        System.out.println("SurveillanceDrone landing safely.");
    }

    // SurveillanceSystem interface methods
    @Override
    public void startMonitoring() {
        System.out.println("SurveillanceDrone starting perimeter monitoring.");
    }

    @Override
    public void recordFootage() {
        System.out.println("SurveillanceDrone recording surveillance footage.");
    }

    @Override
    public void alertSecurity() {
        System.out.println("SurveillanceDrone alerting security team.");
    }
}
