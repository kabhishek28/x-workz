package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ParentalControl;

public class PUBGParentalControlImpl {

    private ParentalControl parentalControl;

    public PUBGParentalControlImpl(ParentalControl parentalControl) {
        this.parentalControl = parentalControl;
    }

    public void enforceControl() {
        if (parentalControl != null) {
            parentalControl.restrictContent();
        } else {
            System.out.println("ParentalControl is null");
        }
    }
}
