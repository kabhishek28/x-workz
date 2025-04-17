package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.LabEquipment;

public class Spectrometer implements LabEquipment {
    @Override
    public void startExperiment() {
        System.out.println("Spectrometer started the experiment.");
    }

    @Override
    public void collectData() {
        System.out.println("Spectrometer collecting data.");
    }

    @Override
    public void shutdownExperiment() {
        System.out.println("Spectrometer shutting down the experiment.");
    }
}