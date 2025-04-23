package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.HealthCareRegulations;

public class Hospital {
    private HealthCareRegulations healthCareRegulations;

    public Hospital(HealthCareRegulations healthCareRegulations) {
        this.healthCareRegulations = healthCareRegulations;
    }
    public void getHealthCareRegulations(){
        if(healthCareRegulations != null){
            healthCareRegulations.provideTreatment();
        }else{
            System.out.println("healthCareRegulations is null");
        }
    }
}
