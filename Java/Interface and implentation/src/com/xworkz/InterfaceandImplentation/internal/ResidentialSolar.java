package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SolarPanel;

public class ResidentialSolar implements SolarPanel {
    @Override
    public void captureSunlight() {
        System.out.println("Residential solar panel capturing sunlight.");
    }

    @Override
    public void generateElectricity() {
        System.out.println("Residential solar panel generating electricity.");
    }

    @Override
    public void reportEfficiency() {
        System.out.println("Residential solar panel reporting efficiency rates.");
    }
}