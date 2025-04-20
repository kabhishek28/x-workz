package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.MedicalDevice;
import com.xworkz.InterfaceandImplentation.RulesClass.MedicalLab;

public class MedicalInstrument implements MedicalDevice, MedicalLab {
    @Override
    public void startMonitoring() {
        System.out.println("startMonitoring in two interfaces ");
    }

    @Override
    public void analyzePatientData() {
        System.out.println("analyzePatientData in two interfaces ");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("triggerAlarm in two interfaces ");
    }

    @Override
    public void collectSample() {
        System.out.println("collectSample in two interfaces ");
    }

    @Override
    public void processSample() {
        System.out.println("processSample in two interfaces ");
    }

    @Override
    public void deliverResults() {
        System.out.println("deliverResults in two interfaces ");
    }
}
