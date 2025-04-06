package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.ClinicalPsychologist;
import com.xworkz.IsARelation.internal.Psychologist;

public class ClinicalPsychologistRunner {
    public static void main(String[] args) {
        Psychologist psychologist1 = new Psychologist();

        psychologist1.assessMentalHealth();
        psychologist1.conductTherapy();
        psychologist1.provideCounseling();
        psychologist1.diagnoseDisorders();
        psychologist1.recommendTreatments();

        System.out.println("---------");
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
