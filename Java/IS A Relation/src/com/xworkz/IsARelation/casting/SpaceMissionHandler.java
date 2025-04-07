package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.LunarLander;
import com.xworkz.IsARelation.internal.Spacecraft;

public class SpaceMissionHandler {
        public SpaceMissionHandler() {
            System.out.println("SpaceMissionHandler Constructor");
        }

        public void handleMission(Spacecraft spacecraft) {
            if (spacecraft != null) {
                spacecraft.launch();
                spacecraft.orbit();
                spacecraft.land();
                spacecraft.communicate();
                spacecraft.fuelType();

                if (spacecraft instanceof LunarLander) {
                    LunarLander lunarLander = (LunarLander) spacecraft;
                    lunarLander.collectMoonSamples();
                } else {
                    System.out.println("This is not an instance of LunarLander.");
                }
            }
        }
}
