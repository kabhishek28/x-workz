package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.DroneSprayer;

public class AgroDrone implements DroneSprayer {
    @Override
    public void takeOff() {
        System.out.println("AgroDrone taking off from the field.");
    }

    @Override
    public void sprayPesticides() {
        System.out.println("AgroDrone spraying pesticides.");
    }

    @Override
    public void returnHome() {
        System.out.println("AgroDrone returning to its base.");
    }
}