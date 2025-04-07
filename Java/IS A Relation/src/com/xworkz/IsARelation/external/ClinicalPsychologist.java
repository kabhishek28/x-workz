package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Psychologist;

public class ClinicalPsychologist extends Psychologist {
    public ClinicalPsychologist() {
        System.out.println("Clinical Psychologist Constructor");
    }
@Override
    public void assessMentalHealth() {
        System.out.println("@Override :Psychologist is assessing mental health");
    }
    @Override
    public void conductTherapy() {
        System.out.println("@Override :Psychologist is conducting therapy sessions");
    }
    @Override
    public void provideCounseling() {
        System.out.println("@Override :Psychologist is providing counseling");
    }
    @Override
    public void diagnoseDisorders() {
        System.out.println("@Override :Psychologist is diagnosing mental disorders");
    }
    @Override
    public void recommendTreatments() {
        System.out.println("@Override :Psychologist is recommending treatments");
    }
    public void runCognitiveTests() {
        System.out.println("Clinical Psychologist is running cognitive tests");
    }

}