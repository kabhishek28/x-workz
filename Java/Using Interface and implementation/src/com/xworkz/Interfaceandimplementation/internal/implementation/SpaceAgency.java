package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.InternationalSpaceRules;


    public class SpaceAgency implements InternationalSpaceRules {
        @Override
        public void followLaunchProtocol() {
            System.out.println("Space agency follows international space launch protocol.");
        }

}