package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Orthodontist;
import com.xworkz.IsARelation.internal.Dentist;

public class OrthodontistRunner {
    public static void main(String[] args) {
        Dentist dentist1 = new Dentist();
        dentist1.examineTeeth();
        dentist1.cleanTeeth();
        dentist1.performToothExtraction();
        dentist1.takeDentalXrays();
        dentist1.provideOralHygieneTips();
        System.out.println("----------");
        Dentist dentist = new Orthodontist();
        dentist.examineTeeth();
        dentist.cleanTeeth();
        dentist.performToothExtraction();
        dentist.takeDentalXrays();
        dentist.provideOralHygieneTips();

        System.out.println("----------");

        Orthodontist orthodontist = new Orthodontist();
        orthodontist.examineTeeth();
        orthodontist.cleanTeeth();
        orthodontist.performToothExtraction();
        orthodontist.takeDentalXrays();
        orthodontist.provideOralHygieneTips();
    }
}
