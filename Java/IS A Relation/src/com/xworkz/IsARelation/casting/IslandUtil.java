package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Greenland;
import com.xworkz.IsARelation.internal.Island;

public class IslandUtil {

        public IslandUtil() {
            System.out.println("IslandUtil Constructor");
        }

        public void getIslandDetails(Island island) {
            if (island != null) {
                island.beSurroundedByWater();
                island.haveBeaches();
                island.supportMarineLife();
                island.experienceTropicalClimate();
                island.attractTourists();

                if (island instanceof Greenland) {
                    Greenland greenland = (Greenland) island;
                    greenland.displaySize();
                } else {
                    System.out.println("island is not an instance of Greenland");
                }

                System.out.println("----- Island Behavior Displayed -----");
            } else {
                System.out.println("Island object is null");
            }
        }


}
