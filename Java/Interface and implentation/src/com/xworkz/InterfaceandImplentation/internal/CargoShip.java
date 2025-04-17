package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Ship;

public class CargoShip implements Ship {
    @Override
    public void sail() {
        System.out.println("Cargo ship sailing.");
    }

    @Override
    public void anchor() {
        System.out.println("Cargo ship anchored.");
    }

    @Override
    public void dock() {
        System.out.println("Cargo ship docked at port.");
    }
}