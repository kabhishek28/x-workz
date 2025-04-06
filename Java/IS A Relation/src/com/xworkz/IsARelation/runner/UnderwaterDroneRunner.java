package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.DeepSeaExplorer;
import com.xworkz.IsARelation.internal.UnderwaterDrone;

public class UnderwaterDroneRunner {
    public static void main(String[] args) {

        UnderwaterDrone underwaterDrone1 = new UnderwaterDrone();
        underwaterDrone1.diveDeep();
        underwaterDrone1.captureMarineLifeFootage();
        underwaterDrone1.collectWaterSamples();
        underwaterDrone1.measureTemperature();
        underwaterDrone1.sendDataToSatellite();

        System.out.println("******************");
        UnderwaterDrone drone = new DeepSeaExplorer();
        drone.diveDeep();
        drone.captureMarineLifeFootage();
        drone.collectWaterSamples();
        drone.measureTemperature();
        drone.sendDataToSatellite();

        System.out.println("******************");

        DeepSeaExplorer explorer = new DeepSeaExplorer();
        explorer.diveDeep();
        explorer.captureMarineLifeFootage();
        explorer.collectWaterSamples();
        explorer.measureTemperature();
        explorer.sendDataToSatellite();
    }
}
