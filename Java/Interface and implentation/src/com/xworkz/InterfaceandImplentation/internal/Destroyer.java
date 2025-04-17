package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.NavalVessel;

public class Destroyer implements NavalVessel {
    @Override
    public void deployTorpedoes() {
        System.out.println("Destroyer deploying torpedoes.");
    }

    @Override
    public void activateSonar() {
        System.out.println("Destroyer activating sonar systems.");
    }

    @Override
    public void returnToBase() {
        System.out.println("Destroyer returning to base for maintenance.");
    }
}