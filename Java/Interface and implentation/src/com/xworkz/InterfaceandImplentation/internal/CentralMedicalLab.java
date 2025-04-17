package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.MedicalLab;

public class CentralMedicalLab implements MedicalLab {
    @Override
    public void collectSample() {
        System.out.println("Central Medical Lab collecting a patient sample.");
    }

    @Override
    public void processSample() {
        System.out.println("Central Medical Lab processing the sample.");
    }

    @Override
    public void deliverResults() {
        System.out.println("Central Medical Lab delivering test results.");
    }
}