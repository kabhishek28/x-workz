package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Radiologist;

public class MRISpecialist extends Radiologist {
    public MRISpecialist() {
        System.out.println("MRI Specialist Constructor");
    }

@Override
    public void conductXRay() {
        System.out.println("@Override :Radiologist is conducting an X-ray scan");
    }
    @Override
    public void analyzeScans() {
        System.out.println("@Override :Radiologist is analyzing medical scans");
    }
    @Override
    public void performUltrasound() {
        System.out.println("@Override :Radiologist is performing an ultrasound");
    }
    @Override
    public void diagnoseInjuries() {
        System.out.println("@Override :Radiologist is diagnosing injuries from scans");
    }
    @Override
    public void collaborateWithDoctors() {
        System.out.println("@Override :Radiologist is collaborating with doctors for treatment plans");
    }
}