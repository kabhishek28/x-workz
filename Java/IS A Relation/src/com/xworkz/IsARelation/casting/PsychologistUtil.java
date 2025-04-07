package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.ClinicalPsychologist;
import com.xworkz.IsARelation.internal.Psychologist;

public class PsychologistUtil {


        public PsychologistUtil() {
            System.out.println("PsychologistUtil constructor is running");
        }

        public void getPsychologist(Psychologist psychologist) {
            if (psychologist != null) {
                psychologist.assessMentalHealth();
                psychologist.conductTherapy();
                psychologist.provideCounseling();
                psychologist.diagnoseDisorders();
                psychologist.recommendTreatments();

                if (psychologist instanceof ClinicalPsychologist) {
                    ClinicalPsychologist clinical = (ClinicalPsychologist) psychologist;
                    clinical.runCognitiveTests();
                } else {
                    System.out.println("psychologist is not an instance of ClinicalPsychologist");
                }
            }
        }


}
