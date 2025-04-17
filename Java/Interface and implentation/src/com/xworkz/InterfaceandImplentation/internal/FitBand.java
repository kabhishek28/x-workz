package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.FitnessTracker;

public class FitBand implements FitnessTracker {
    @Override
    public void recordWorkout() {
        System.out.println("FitBand recording the workout session.");
    }

    @Override
    public void calculateCalories() {
        System.out.println("FitBand calculating calories burned.");
    }

    @Override
    public void syncData() {
        System.out.println("FitBand syncing workout data to the app.");
    }
}