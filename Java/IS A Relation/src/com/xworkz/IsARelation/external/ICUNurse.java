package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Nurse;

public class ICUNurse extends Nurse {
    public ICUNurse() {
        System.out.println("ICU Nurse Constructor");
    }
@Override
    public void assistDoctor() {
        System.out.println("@Override :Nurse is assisting the doctor");
    }
    @Override
    public void administerMedicine() {
        System.out.println("@Override :Nurse is administering medicine to the patient");
    }
    @Override
    public void checkPatientVitals() {
        System.out.println("@Override :Nurse is checking patient vitals");
    }
    @Override
    public void providePatientCare() {
        System.out.println("@Override :Nurse is providing care to the patient");
    }
    @Override
    public void handleMedicalEquipment() {
        System.out.println("@Override :Nurse is handling medical equipment");
    }

    public void monitorCriticalPatients() {
        System.out.println("ICU Nurse is monitoring critical patients...");
    }

}