package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.VetClinic;

public class PetCareCenter implements VetClinic {
    @Override
    public void examinePet() {
        System.out.println("Examining pet.");
    }

    @Override
    public void giveVaccination() {
        System.out.println("Vaccinating pet.");
    }

    @Override
    public void suggestDiet() {
        System.out.println("Suggesting pet diet.");
    }
}