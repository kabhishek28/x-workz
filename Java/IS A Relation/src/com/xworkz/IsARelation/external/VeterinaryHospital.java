package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Hospital;

public class VeterinaryHospital extends Hospital {
    public VeterinaryHospital() {
        System.out.println("VeterinaryHospital Constructor");
    }
@Override
    public void admitPatient() {
        System.out.println("@Override :Hospital is admitting a patient");
    }
    @Override
    public void provideTreatment() {
        System.out.println("@Override :Hospital is providing treatment");
    }
    @Override
    public void performSurgery() {
        System.out.println("@Override :Hospital is performing surgery");
    }
    @Override
    public void dischargePatient() {
        System.out.println("@Override :Hospital is discharging a patient");
    }
    @Override
    public void managePharmacy() {
        System.out.println("@Override :Hospital is managing its pharmacy");
    }
}