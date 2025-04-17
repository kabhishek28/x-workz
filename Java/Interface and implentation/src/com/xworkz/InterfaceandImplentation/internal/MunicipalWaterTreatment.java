package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.WaterTreatment;

public class MunicipalWaterTreatment implements WaterTreatment {
    @Override
    public void purifyWater() {
        System.out.println("Municipal plant purifying water.");
    }

    @Override
    public void monitorFlow() {
        System.out.println("Monitoring water flow in treatment plant.");
    }

    @Override
    public void adjustPressure() {
        System.out.println("Adjusting water pressure for optimal flow.");
    }
}