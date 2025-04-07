package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.JCB;
import com.xworkz.IsARelation.internal.ConstructionMachine;

public class ConstructionHandler {

        public ConstructionHandler() {
            System.out.println("ConstructionHandler Constructor");
        }

        public void handleMachine(ConstructionMachine machine) {
            if (machine != null) {
                machine.operate();
                machine.loadMaterial();
                machine.moveToSite();
                machine.performMaintenance();
                machine.shutDown();

                if (machine instanceof JCB) {
                    JCB jcb = (JCB) machine;
                    jcb.digGround();
                } else {
                    System.out.println("Machine is not an instance of JCB.");
                }
            }
        }


}
