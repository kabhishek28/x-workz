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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof FitnessTracker) {
                FitnessTracker other = (FitnessTracker) object;
                if (this.user.equals(other.user) &&
                        this.steps == other.steps &&
                        this.calories == other.calories) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
