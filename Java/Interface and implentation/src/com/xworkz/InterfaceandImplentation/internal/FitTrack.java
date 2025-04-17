package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.FitnessApp;

public class FitTrack implements FitnessApp {
    @Override
    public void trackExercise() {
        System.out.println("FitTrack is tracking the exercise session.");
    }

    @Override
    public void calculateDistance() {
        System.out.println("FitTrack is calculating the distance covered.");
    }

    @Override
    public void showProgress() {
        System.out.println("FitTrack is displaying the workout progress.");
    }
}