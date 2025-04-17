package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Telemedicine;

public class RemoteMedConsult implements Telemedicine {
    @Override
    public void scheduleConsultation() {
        System.out.println("Scheduling telemedicine consultation.");
    }

    @Override
    public void conductVideoCall() {
        System.out.println("Conducting a video call with the patient.");
    }

    @Override
    public void transmitMedicalRecords() {
        System.out.println("Transmitting medical records securely.");
    }
}