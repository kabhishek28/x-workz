package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.UnderwaterDrone;

public class DeepSeaExplorer extends UnderwaterDrone {
    public DeepSeaExplorer() {
        System.out.println("No-argument constructor: Deep Sea Explorer");
    }
@Override
    public void diveDeep() {
        System.out.println("@Override :Underwater Drone is diving deep...");
    }
    @Override
    public void captureMarineLifeFootage() {
        System.out.println("@Override :Underwater Drone is capturing footage of marine life...");
    }
    @Override
    public void collectWaterSamples() {
        System.out.println("@Override :Underwater Drone is collecting water samples...");
    }
    @Override
    public void measureTemperature() {
        System.out.println("@Override :Underwater Drone is measuring water temperature...");
    }
    @Override
    public void sendDataToSatellite() {
        System.out.println("@Override :Underwater Drone is sending data to a satellite...");
    }

}
