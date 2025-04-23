package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.HealthCareRegulations;

public class CityHospitalHealthCare implements HealthCareRegulations {
    public CityHospitalHealthCare() {
        System.out.println("CityHospitalHealthCare const");
    }

    @Override
    public void provideTreatment() {
        System.out.println("provide Treatment in CityHospitalHealthCare class");
    }
}
