package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Surgeon;
import com.xworkz.IsARelation.internal.Doctor;

public class SurgeonRunner {
    public static void main(String[] args) {
        // Using parent class reference to child class object
        Doctor doctor = new Surgeon();
        doctor.diagnose();
        doctor.prescribeMedicine();
        doctor.checkVitals();
        doctor.conductCheckup();
        doctor.adviseRest();

        System.out.println("******************");

        // Using child class reference
        Surgeon surgeon = new Surgeon();
        surgeon.diagnose();
        surgeon.prescribeMedicine();
        surgeon.checkVitals();
        surgeon.conductCheckup();
        surgeon.adviseRest();
    }
}
