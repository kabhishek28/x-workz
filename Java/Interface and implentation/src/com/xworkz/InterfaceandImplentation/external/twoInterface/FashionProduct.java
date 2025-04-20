package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.FashionBoutique;
import com.xworkz.InterfaceandImplentation.RulesClass.FitnessApp;

public class FashionProduct implements FashionBoutique, FitnessApp {
    @Override
    public void displayCollection() {
        System.out.println("display Collection method in two interface");
    }

    @Override
    public void assistCustomer() {
        System.out.println("display assistCustomer method in two interface");

    }

    @Override
    public void processPurchase() {
        System.out.println("display processPurchase method in two interface");

    }

    @Override
    public void trackExercise() {
        System.out.println("display trackExercise method in two interface");

    }

    @Override
    public void calculateDistance() {
        System.out.println(" display calculateDistance method in two interface");

    }

    @Override
    public void showProgress() {
        System.out.println("display showProgress  method in two interface");

    }
}
