package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.MarsRover;
import com.xworkz.IsARelation.internal.SpaceProbe;

public class SpaceProbeRunner {

        public SpaceProbeRunner() {
            System.out.println("SpaceMissionHandler Constructor");
        }

        public void handleProbe(SpaceProbe probe) {
            if (probe != null) {
                probe.launch();
                probe.collectData();
                probe.sendSignal();
                probe.analyzeSamples();
                probe.navigate();

                if (probe instanceof MarsRover) {
                    MarsRover rover = (MarsRover) probe;
                    rover.drillSurface();
                } else {
                    System.out.println("This is not a MarsRover instance.");
                }
            }
        }


}
