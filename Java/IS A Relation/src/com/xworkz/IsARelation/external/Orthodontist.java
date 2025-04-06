package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Dentist;

public class Orthodontist extends Dentist {
    public Orthodontist() {
        System.out.println("Orthodontist Constructor");
    }

    @Override
    public void examineTeeth() {
        System.out.println("@Override :Dentist is examining teeth");
    }
    @Override
    public void cleanTeeth() {
        System.out.println("@Override :Dentist is cleaning teeth");
    }
    @Override
    public void performToothExtraction() {
        System.out.println("@Override :Dentist is performing tooth extraction");
    }
    @Override
    public void takeDentalXrays() {
        System.out.println("@Override :Dentist is taking dental X-rays");
    }
    @Override
    public void provideOralHygieneTips() {
        System.out.println("@Override :Dentist is providing oral hygiene tips");
    }
}