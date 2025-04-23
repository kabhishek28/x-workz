package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.WorkoutPolicy;

public class FitbitWorkoutImpl {
    private WorkoutPolicy workoutPolicy;

    public FitbitWorkoutImpl(WorkoutPolicy workoutPolicy) {
        this.workoutPolicy = workoutPolicy;
    }

    public void monitorWorkout() {
        if (workoutPolicy != null) {
            workoutPolicy.trackWorkout();
        } else {
            System.out.println("WorkoutPolicy is null");
        }
    }
}
