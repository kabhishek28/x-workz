package com.xworkz.ToString.internal;

public class FitnessTracker {
    private String user;
    private int steps;
    private double calories;

    public FitnessTracker(String user, int steps, double calories) {
        this.user = user;
        this.steps = steps;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "User: " + user + ", Steps: " + steps + ", Calories: " + calories;
    }
}

    // Runner
