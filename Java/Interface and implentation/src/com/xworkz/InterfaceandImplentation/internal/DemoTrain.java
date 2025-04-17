package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Train;

public class DemoTrain implements Train {


        @Override
        public void boardPassengers() {
            System.out.println("Passengers boarding the metro train.");
        }

        @Override
        public void runTrain() {
            System.out.println("Metro train running on schedule.");
        }

        @Override
        public void announceStop() {
            System.out.println("Announcing the upcoming station stop.");
        }

}
