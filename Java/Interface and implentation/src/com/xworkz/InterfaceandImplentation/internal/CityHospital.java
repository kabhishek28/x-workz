package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Hospital;

public class CityHospital implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Patient admitted to City Hospital.");
    }
    @Override

    public void dischargePatient() {
        System.out.println("Patient discharged from City Hospital.");
    }
    @Override

    public void calculateBill() {
        System.out.println("Hospital bill calculated.");
    }
}
