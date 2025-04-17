package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.DigitalArtSoftware;

public class Photoshop implements DigitalArtSoftware {
    @Override
    public void createArtwork() {
        System.out.println("Photoshop is creating digital artwork.");
    }

    @Override
    public void applyFilter() {
        System.out.println("Photoshop is applying filters.");
    }

    @Override
    public void exportFile() {
        System.out.println("Photoshop is exporting the artwork.");
    }
}