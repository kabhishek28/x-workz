package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Tractor;

public class FarmingTractor implements Tractor {
    @Override
    public void plowField() {
        System.out.println("Plowing the field.");
    }

    @Override
    public void sowSeeds() {
        System.out.println("Sowing seeds.");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting crops.");
    }
}