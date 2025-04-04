package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cardiologist;
import com.xworkz.IsARelation.external.InterventionalCardiologist;

public class InterventionalCardiologistRunner {
    public static void main(String[] args) {
        Cardiologist cardiologist = new InterventionalCardiologist();

        cardiologist.adviseRest();
        cardiologist.checkVitals();
        cardiologist.diagnose();
        cardiologist.conductCheckup();
        cardiologist.prescribeMedicine();

        System.out.println("---------------");

        InterventionalCardiologist interventionalCardiologist = new InterventionalCardiologist();
        interventionalCardiologist.adviseRest();
        interventionalCardiologist.checkVitals();
        interventionalCardiologist.diagnose();
        interventionalCardiologist.conductCheckup();
        interventionalCardiologist.prescribeMedicine();
    }
}
