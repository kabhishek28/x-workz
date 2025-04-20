package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.AutonomousVehicle;
import com.xworkz.InterfaceandImplentation.RulesClass.ElectricCar;

public class HybridVehicle implements ElectricCar, AutonomousVehicle {
    @Override public void chargeBattery() { System.out.println("HybridVehicle charging battery."); }
    @Override public void drive() { System.out.println("HybridVehicle driving manually."); }
    @Override public void showStatus() { System.out.println("HybridVehicle displaying battery status."); }
    @Override public void startNavigation() { System.out.println("HybridVehicle starting autonomous navigation."); }
    @Override public void avoidObstacles() { System.out.println("HybridVehicle avoiding obstacles."); }
    @Override public void stopNavigation() { System.out.println("HybridVehicle stopping autonomous navigation."); }
}