package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.WorkoutPolicy;

public class FitnessApp implements WorkoutPolicy {
    @Override
    public void trackWorkout() {
        System.out.println("Fitness app tracks user's workout progress.");
    }
}