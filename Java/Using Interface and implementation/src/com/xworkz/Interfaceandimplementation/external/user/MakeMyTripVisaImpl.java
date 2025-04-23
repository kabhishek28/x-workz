package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.VisaRegulation;

public class MakeMyTripVisaImpl {
    private VisaRegulation visaRegulation;

    public MakeMyTripVisaImpl(VisaRegulation visaRegulation) {
        this.visaRegulation = visaRegulation;
    }

    public void processVisa() {
        if (visaRegulation != null) {
            visaRegulation.applyVisa();
        } else {
            System.out.println("VisaRegulation is null");
        }
    }
}
