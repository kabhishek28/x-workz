package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.InternationalSpaceRules;

public class ISROLaunchImpl {
    private InternationalSpaceRules spaceRules;

    public ISROLaunchImpl(InternationalSpaceRules spaceRules) {
        this.spaceRules = spaceRules;
    }

    public void executeLaunch() {
        if (spaceRules != null) {
            spaceRules.followLaunchProtocol();
        } else {
            System.out.println("InternationalSpaceRules is null");
        }
    }
}