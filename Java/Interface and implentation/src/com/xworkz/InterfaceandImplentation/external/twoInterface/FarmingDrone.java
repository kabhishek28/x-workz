package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.DroneSprayer;
import com.xworkz.InterfaceandImplentation.RulesClass.SmartDevice;

public class FarmingDrone implements DroneSprayer, SmartDevice {
    @Override public void takeOff() { System.out.println("FarmingDrone taking off for crop spraying."); }
    @Override public void sprayPesticides() { System.out.println("FarmingDrone spraying pesticides over field."); }
    @Override public void returnHome() { System.out.println("FarmingDrone returning to base."); }
    @Override public void turnOn() { System.out.println("FarmingDrone systems activated."); }
    @Override public void operate() { System.out.println("FarmingDrone operating spray mechanism."); }
    @Override public void turnOff() { System.out.println("FarmingDrone systems powered down."); }
}