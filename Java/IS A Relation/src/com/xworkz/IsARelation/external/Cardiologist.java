package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Doctor;

public class Cardiologist extends Doctor {
    public Cardiologist() {
        System.out.println("Cardiologist Constructor");
    }

    @Override
    public void diagnose() {
        System.out.println("@Override :Doctor is diagnosing a patient...");
    }
    @Override
    public void prescribeMedicine() {
        System.out.println("@Override :Doctor is prescribing medicine...");
    }
    @Override
    public void checkVitals() {
        System.out.println("@Override :Doctor is checking patient's vitals...");
    }
    @Override
    public void conductCheckup() {
        System.out.println("@Override :Doctor is conducting a checkup...");
    }
    @Override
    public void adviseRest() {
        System.out.println("@Override :Doctor is advising rest...");
    }
}
