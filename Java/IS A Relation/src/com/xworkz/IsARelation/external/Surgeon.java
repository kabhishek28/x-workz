package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Doctor;
import com.xworkz.IsARelation.internal.MedicalProfessional;

public class Surgeon extends MedicalProfessional {

    public Surgeon() {
        System.out.println("No-argument constructor: Surgeon");
    }




@Override
    public void treatPatients() {
        System.out.println("@Override :Treating patients with care...");
    }
    @Override
    public void prescribeMedicine() {
        System.out.println("@Override :Prescribing appropriate medicine...");
    }
    @Override
    public void monitorHealth() {
        System.out.println("@Override :Monitoring patient's health...");
    }
    @Override
    public void performCheckup() {
        System.out.println("@Override :Performing a medical checkup...");
    }
    @Override
    public void maintainRecords() {
        System.out.println("@Override :Maintaining patient medical records...");
    }
}