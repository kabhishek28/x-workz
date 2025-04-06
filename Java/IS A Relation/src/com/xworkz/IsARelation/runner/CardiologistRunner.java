package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cardiologist;
import com.xworkz.IsARelation.internal.Doctor;

public class CardiologistRunner {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        doctor1.diagnose();
        doctor1.prescribeMedicine();
        doctor1.adviseRest();
        doctor1.diagnose();
        doctor1.conductCheckup();


        System.out.println("------------------------");


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
