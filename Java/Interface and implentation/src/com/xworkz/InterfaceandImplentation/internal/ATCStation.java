package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ControlTower;

public class ATCStation implements ControlTower {
    @Override
    public void authorizeTakeOff() {
        System.out.println("Takeoff authorized.");
    }

    @Override
    public void monitorAirspace() {
        System.out.println("Monitoring airspace.");
    }

    @Override
    public void authorizeLanding() {
        System.out.println("Landing authorized.");
    }
}