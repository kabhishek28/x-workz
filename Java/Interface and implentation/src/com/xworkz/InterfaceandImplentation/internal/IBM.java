package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.OfficeRules;

public class IBM implements OfficeRules {
    @Override
    public void wearID() {
        System.out.println("wear ID card in Xworkz");
    }

    @Override
    public void Timing() {
        System.out.println("Timing  card in Xworkz");
    }

    @Override
    public void wearShoue() {
        System.out.println("wearShoue  card in Xworkz");
    }
}
