package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.FitnessTracker;
import com.xworkz.InterfaceandImplentation.RulesClass.SmartWatch;

public class FitnessMonitor implements FitnessTracker, SmartWatch {
    @Override public void recordWorkout() { System.out.println("FitnessMonitor recording workout."); }
    @Override public void calculateCalories() { System.out.println("FitnessMonitor calculating calories burned."); }
    @Override public void syncData() { System.out.println("FitnessMonitor syncing data to cloud."); }
    @Override public void displayTime() { System.out.println("FitnessMonitor displaying current time."); }
    @Override public void monitorHeartRate() { System.out.println("FitnessMonitor monitoring heart rate."); }
    @Override public void runApps() { System.out.println("FitnessMonitor running fitness apps."); }

}
