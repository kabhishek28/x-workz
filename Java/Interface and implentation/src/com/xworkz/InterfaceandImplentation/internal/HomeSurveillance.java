package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SurveillanceSystem;

public class HomeSurveillance implements SurveillanceSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Home surveillance system started monitoring.");
    }

    @Override
    public void recordFootage() {
        System.out.println("Home surveillance system recording footage.");
    }

    @Override
    public void alertSecurity() {
        System.out.println("Home surveillance system alerting security.");
    }
}