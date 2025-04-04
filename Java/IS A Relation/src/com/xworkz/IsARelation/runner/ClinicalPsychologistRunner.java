package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.ClinicalPsychologist;
import com.xworkz.IsARelation.internal.Psychologist;

public class ClinicalPsychologistRunner {
    public static void main(String[] args) {
        Psychologist psychologist = new ClinicalPsychologist();
        psychologist.assessMentalHealth();
        psychologist.conductTherapy();
        psychologist.provideCounseling();
        psychologist.diagnoseDisorders();
        psychologist.recommendTreatments();

        System.out.println("---------");

        ClinicalPsychologist clinicalPsychologist = new ClinicalPsychologist();
        clinicalPsychologist.assessMentalHealth();
        clinicalPsychologist.conductTherapy();
        clinicalPsychologist.provideCounseling();
        clinicalPsychologist.diagnoseDisorders();
        clinicalPsychologist.recommendTreatments();
    }
}
