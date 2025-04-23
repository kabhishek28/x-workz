package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.VisaRegulation;

public class TravelPortal implements VisaRegulation {
    @Override
    public void applyVisa() {
        System.out.println("Travel portal helps users to apply for visas.");
    }
}