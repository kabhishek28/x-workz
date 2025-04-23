package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.Consitution;

public class CitizenConstituion implements Consitution {
    public CitizenConstituion() {
        System.out.println("CitizenConstituion conts");
    }

    @Override
    public void followLaws() {
        System.out.println("Follow laws method in CitizenConstituion class");
    }
}
