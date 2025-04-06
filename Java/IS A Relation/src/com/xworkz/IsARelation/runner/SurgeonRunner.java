package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Surgeon;

import com.xworkz.IsARelation.internal.MedicalProfessional;

public class SurgeonRunner {
    public static void main(String[] args) {

        MedicalProfessional medicalProfessional = new MedicalProfessional();
        medicalProfessional.maintainRecords();
        medicalProfessional.monitorHealth();
        medicalProfessional.performCheckup();
        medicalProfessional.treatPatients();
        medicalProfessional.prescribeMedicine();
        System.out.println("------------------");
        MedicalProfessional medicalProfessional1 = new Surgeon();
        medicalProfessional1.maintainRecords();
        medicalProfessional1.monitorHealth();
        medicalProfessional1.performCheckup();
        medicalProfessional1.treatPatients();
        medicalProfessional1.prescribeMedicine();
        System.out.println("------------------------");
        Surgeon surgeon = new Surgeon();
        surgeon.maintainRecords();
        surgeon.monitorHealth();
        surgeon.performCheckup();
        surgeon.treatPatients();
        surgeon.prescribeMedicine();






    }
}
