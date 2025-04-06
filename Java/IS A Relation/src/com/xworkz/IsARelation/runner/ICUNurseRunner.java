package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.ICUNurse;
import com.xworkz.IsARelation.internal.Nurse;

public class ICUNurseRunner {
    public static void main(String[] args) {
        Nurse nurse1 = new Nurse();
        nurse1.assistDoctor();
        nurse1.administerMedicine();
        nurse1.checkPatientVitals();
        nurse1.providePatientCare();
        nurse1.handleMedicalEquipment();
        System.out.println("---------------");
        Nurse nurse = new ICUNurse();
        nurse.assistDoctor();
        nurse.administerMedicine();
        nurse.checkPatientVitals();
        nurse.providePatientCare();
        nurse.handleMedicalEquipment();
        System.out.println("---------------");
        ICUNurse icuNurse = new ICUNurse();
        icuNurse.assistDoctor();
        icuNurse.administerMedicine();
        icuNurse.checkPatientVitals();
        icuNurse.providePatientCare();
        icuNurse.handleMedicalEquipment();
    }
}
