package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.LabourLaw;

public class ITCompanyLabourLawImpl implements LabourLaw {
    public ITCompanyLabourLawImpl() {
        System.out.println("ITCompanyLabourLawImpl const");
    }

    @Override
    public void provideSalary() {
        System.out.println("provideSalary method in ITCompanyLabourLawImpl class");
    }
}
