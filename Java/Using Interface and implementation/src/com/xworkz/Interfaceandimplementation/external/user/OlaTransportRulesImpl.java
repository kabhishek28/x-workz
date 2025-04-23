package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.TransportRules;

public class OlaTransportRulesImpl {
    private TransportRules transportRules;

    public OlaTransportRulesImpl(TransportRules transportRules) {
        this.transportRules = transportRules;
    }

    public void checkRules() {
        if (transportRules != null) {
            transportRules.followTrafficLaws();
        } else {
            System.out.println("TransportRules is null");
        }
    }
}