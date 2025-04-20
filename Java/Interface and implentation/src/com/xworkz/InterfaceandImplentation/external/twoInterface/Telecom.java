package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.Telemedicine;
import com.xworkz.InterfaceandImplentation.RulesClass.Telescope;

public class Telecom implements Telemedicine, Telescope {


    @Override
    public void scheduleConsultation() {
        System.out.println("schedule Consultation of two interface");
    }

    @Override
    public void conductVideoCall() {
        System.out.println("conductVideoCall  of two interface");
    }

    @Override
    public void transmitMedicalRecords() {
        System.out.println("transmitMedicalRecords  of two interface");
    }

    @Override
    public void adjustLens() {
        System.out.println("adjustLens  of two interface");
    }

    @Override
    public void captureImage() {
        System.out.println("captureImage  of two interface");
    }

    @Override
    public void trackCelestialBody() {
        System.out.println("trackCelestialBody  of two interface");
    }
}
