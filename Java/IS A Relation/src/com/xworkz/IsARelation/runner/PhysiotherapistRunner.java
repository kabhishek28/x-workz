package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Physiotherapist;
import com.xworkz.IsARelation.internal.Therapist;

public class PhysiotherapistRunner {
    public static void main(String[] args) {
        Therapist therapist = new Physiotherapist();
        therapist.assessCondition();
        therapist.developTreatmentPlan();
        therapist.performTherapy();
        therapist.trackProgress();
        therapist.educatePatients();
        System.out.println("------------");

        Physiotherapist physiotherapist = new Physiotherapist();
        physiotherapist.assessCondition();
        physiotherapist.developTreatmentPlan();
        physiotherapist.performTherapy();
        physiotherapist.trackProgress();
        physiotherapist.educatePatients();
    }
}
