package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.MedicalDevice;

public class HeartRateMonitor implements MedicalDevice {
    @Override
    public void startMonitoring() {
        System.out.println("Heart rate monitor started monitoring patient vitals.");
    }

    @Override
    public void analyzePatientData() {
        System.out.println("Analyzing patient heart rate data.");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Alarm triggered due to irregular heart rate.");
    }
}