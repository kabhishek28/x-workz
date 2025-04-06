package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Therapist;

public class Physiotherapist extends Therapist {
    public Physiotherapist() {
        System.out.println("Physiotherapist Constructor");
    }

@Override
    public void assessCondition() {
        System.out.println(" @Override :Therapist is assessing the patient's condition");
    }

    public void developTreatmentPlan() {
        System.out.println(" @Override :Therapist is developing a treatment plan");
    }

    public void performTherapy() {
        System.out.println("@Override :Therapist is performing therapy sessions");
    }

    public void trackProgress() {
        System.out.println("@Override :Therapist is tracking patient's progress");
    }

    public void educatePatients() {
        System.out.println("@Override : Therapist is educating patients about therapy");
    }
}