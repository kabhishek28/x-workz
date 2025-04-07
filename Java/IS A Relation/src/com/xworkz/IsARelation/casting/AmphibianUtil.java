package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Frog;
import com.xworkz.IsARelation.internal.Amphibian;

public class AmphibianUtil {



        public AmphibianUtil() {
            System.out.println("AmphibianUtil Constructor");
        }

        public void getAmphibianDetails(Amphibian amphibian) {
            if (amphibian != null) {
                amphibian.swim();
                amphibian.jump();
                amphibian.breatheThroughSkin();
                amphibian.layEggsInWater();
                amphibian.transitionToLand();

                if (amphibian instanceof Frog) {
                    Frog frog = (Frog) amphibian;
                    frog.catchInsects();
                } else {
                    System.out.println("amphibian is not an instance of Frog");
                }

            } else {
                System.out.println("Amphibian object is null");
            }
        }


}
