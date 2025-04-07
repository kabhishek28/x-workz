package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Everest;
import com.xworkz.IsARelation.internal.Mountain;

public class MountainInfo {

        public MountainInfo() {
            System.out.println("MountainInfo Constructor");
        }

        public void getMountainDetails(Mountain mountain) {
            if (mountain != null) {
                mountain.rise();
                mountain.erode();
                mountain.provideHabitat();
                mountain.regulateClimate();
                mountain.storeGlaciers();

                if (mountain instanceof Everest) {
                    Everest everest = (Everest) mountain;
                    everest.showPeakHeight();

                } else {
                    System.out.println("Mountain is not an instance of Everest");
                }

            } else {
                System.out.println("Mountain object is null");
            }
        }


}
