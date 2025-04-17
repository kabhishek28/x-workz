package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.CollegeRules;

public class Xworkz implements CollegeRules {
    @Override
    public void wearID() {
        System.out.println("wear ID card in Xworkz");
    }
    @Override
    public void wearFormals() {
        System.out.println("wear Formals card in Xworkz");
    }
    @Override
    public void wearShoue() {
        System.out.println("wear Shoue card in Xworkz");
    }
}

