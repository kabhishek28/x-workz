package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Physiotherapist;
import com.xworkz.IsARelation.internal.Therapist;

public class PhysiotherapistRunner {
    public static void main(String[] args) {
        Therapist therapist1 = new Physiotherapist();
        therapist1.assessCondition();
        therapist1.developTreatmentPlan();
        therapist1.performTherapy();
        therapist1.trackProgress();
        therapist1.educatePatients();
        System.out.println("------------");
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
