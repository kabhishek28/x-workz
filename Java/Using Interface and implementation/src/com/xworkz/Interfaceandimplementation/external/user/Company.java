package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.LabourLaw;

public class Company {
    private LabourLaw labourLaw;

    public Company(LabourLaw labourLaw) {
        this.labourLaw = labourLaw;
    }

    public void getLabourLaw(){
        if(labourLaw != null){
            labourLaw.provideSalary();
        }else{
            System.out.println("labour is null");
        }
    }
}
