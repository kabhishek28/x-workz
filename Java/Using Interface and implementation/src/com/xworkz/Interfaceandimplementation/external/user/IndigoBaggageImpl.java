package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.BaggagePolicy;

public class IndigoBaggageImpl {
    private BaggagePolicy baggagePolicy;

    public IndigoBaggageImpl(BaggagePolicy baggagePolicy) {
        this.baggagePolicy = baggagePolicy;
    }

    public void validateBaggage() {
        if (baggagePolicy != null) {
            baggagePolicy.checkBaggageLimit();
        } else {
            System.out.println("BaggagePolicy is null");
        }
    }
}

