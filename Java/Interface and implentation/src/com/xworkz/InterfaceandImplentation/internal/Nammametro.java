package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Metro;

public class Nammametro implements Metro {
    @Override
    public void pickUpPoint() {
        System.out.println("pick up point");
    }

    @Override
    public void dropPoint() {
        System.out.println("drop point");
    }

    @Override
    public void price() {
        System.out.println("price of metro");
    }
}
