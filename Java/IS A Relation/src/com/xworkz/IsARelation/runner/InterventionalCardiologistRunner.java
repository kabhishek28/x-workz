package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.internal.Cardiologist;
import com.xworkz.IsARelation.external.InterventionalCardiologist;

public class InterventionalCardiologistRunner {
    public static void main(String[] args) {
        Cardiologist cardiologist1 = new Cardiologist();
        cardiologist1.checkHeartRate();
        cardiologist1.adviseLifestyleChanges();
        cardiologist1.diagnoseHeartDiseases();
        cardiologist1.performAngioplasty();
        cardiologist1.prescribeHeartMedication();
        System.out.println("---------------------");



        Cardiologist cardiologist = new InterventionalCardiologist();

        cardiologist.checkHeartRate();
        cardiologist.adviseLifestyleChanges();
        cardiologist.diagnoseHeartDiseases();
        cardiologist.performAngioplasty();
        cardiologist.prescribeHeartMedication();

        System.out.println("---------------");

        InterventionalCardiologist interventionalCardiologist = new InterventionalCardiologist();
        interventionalCardiologist.checkHeartRate();
        interventionalCardiologist.adviseLifestyleChanges();
        interventionalCardiologist.diagnoseHeartDiseases();
        interventionalCardiologist.performAngioplasty();
        interventionalCardiologist.prescribeHeartMedication();
    }
}
