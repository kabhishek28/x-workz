package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ICC;

public class IndianCricketTeamIcc implements ICC {
    public IndianCricketTeamIcc() {
        System.out.println("IndianCricketTeamIcc const");
    }

    @Override
    public void setRules() {
        System.out.println("SET of rules of ICC implements in BCCI");
    }
}
