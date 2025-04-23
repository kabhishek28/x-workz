package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.PackagingStandards;

public class DeliveryApp implements PackagingStandards {
    @Override
    public void sealPackage() {
        System.out.println("Delivery App ensures food packages are properly sealed.");
    }
}
