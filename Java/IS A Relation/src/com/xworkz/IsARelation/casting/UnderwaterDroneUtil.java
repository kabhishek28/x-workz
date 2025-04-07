package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.DeepSeaExplorer;
import com.xworkz.IsARelation.internal.UnderwaterDrone;

public class UnderwaterDroneUtil {


        public UnderwaterDroneUtil() {
            System.out.println("UnderwaterDroneUtil Constructor");
        }

        public void exploreOcean(UnderwaterDrone drone) {
            if (drone != null) {
                drone.diveDeep();
                drone.captureMarineLifeFootage();
                drone.collectWaterSamples();
                drone.measureTemperature();
                drone.sendDataToSatellite();

                if (drone instanceof DeepSeaExplorer) {
                    System.out.println("Specialized drone: DeepSeaExplorer in action!");
                }
            } else {
                System.out.println("Drone object is null");
            }
        }


}
