package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.WaterTreatment;
import com.xworkz.InterfaceandImplentation.RulesClass.WindTurbine;

public class NaturalResources implements WaterTreatment, WindTurbine {
    @Override
    public void purifyWater() {
        System.out.println("purify Water method in two Interfaces");
    }

    @Override
    public void monitorFlow() {
        System.out.println("monitorFlow  method in two Interfaces");
    }

    @Override
    public void adjustPressure() {
        System.out.println("adjustPressure  method in two Interfaces");
    }

    @Override
    public void startTurbine() {
        System.out.println("startTurbine  method in two Interfaces");
    }

    @Override
    public void adjustBlades() {
        System.out.println("adjustBlades  method in two Interfaces");
    }

    @Override
    public void shutdownTurbine() {
        System.out.println("shutdownTurbine  method in two Interfaces");
    }
}
