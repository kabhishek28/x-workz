package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cardiologist;
import com.xworkz.IsARelation.internal.Cardiologistt;
import com.xworkz.IsARelation.external.InterventionalCardiologist;

public class InterventionalCardiologistRunner {
    public static void main(String[] args) {
        Cardiologist cardiologist1 = new Cardiologist();
        cardiologist1.givingTablets();
        cardiologist1.prescribeMedicine();
        cardiologist1.conductCheckup();
        cardiologist1.diagnose();
        cardiologist1.adviseRest();

        System.out.println("---------------------");



        //Cardiologist cardiologist = new InterventionalCardiologist();



        System.out.println("---------------");

        InterventionalCardiologist interventionalCardiologist = new InterventionalCardiologist();
        interventionalCardiologist.checkHeartRate();
        interventionalCardiologist.adviseLifestyleChanges();
        interventionalCardiologist.diagnoseHeartDiseases();
        interventionalCardiologist.performAngioplasty();
        interventionalCardiologist.prescribeHeartMedication();
    }
}
