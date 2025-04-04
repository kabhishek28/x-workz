package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cardiologist;
import com.xworkz.IsARelation.internal.Doctor;

public class CardiologistRunner {
    public static void main(String[] args) {
        Doctor doctor = new Cardiologist();
        doctor.diagnose();
        doctor.prescribeMedicine();
        doctor.adviseRest();
        doctor.diagnose();
        doctor.conductCheckup();
        System.out.println("-------------------");
        Cardiologist cardiologist = new Cardiologist();
        cardiologist.diagnose();
        cardiologist.prescribeMedicine();
        cardiologist.adviseRest();
        cardiologist.diagnose();
        cardiologist.conductCheckup();
    }
}
