package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.MedicalRobot;

public class SurgicalRobot extends MedicalRobot {

    public SurgicalRobot() {
        System.out.println("No-argument constructor: Surgical Robot");
    }
@Override
    public void diagnose() {
        System.out.println("@Override Medical Robot is diagnosing the patient...");
    }
    @Override
    public void assistSurgery() {
        System.out.println("@Override Medical Robot is assisting in surgery...");
    }
    @Override
    public void dispenseMedicine() {
        System.out.println("@Override Medical Robot is dispensing medicine...");
    }
    @Override
    public void monitorVitals() {
        System.out.println("@Override Medical Robot is monitoring patient vitals...");
    }
    @Override
    public void sterilizeEquipment() {
        System.out.println("@Override Medical Robot is sterilizing surgical tools...");
    }
}

