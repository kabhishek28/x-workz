package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.HealthRegulation;

public class HospitalSystem implements HealthRegulation {
    @Override
    public void followSanitationRules() {
        System.out.println("Hospital follows strict sanitation and hygiene protocols.");
    }
}
