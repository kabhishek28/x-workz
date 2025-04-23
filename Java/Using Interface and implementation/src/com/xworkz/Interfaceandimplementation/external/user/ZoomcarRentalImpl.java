package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.RentalPolicy;

public class ZoomcarRentalImpl {
    private RentalPolicy rentalPolicy;

    public ZoomcarRentalImpl(RentalPolicy rentalPolicy) {
        this.rentalPolicy = rentalPolicy;
    }

    public void processRental() {
        if (rentalPolicy != null) {
            rentalPolicy.checkAvailability();
        } else {
            System.out.println("RentalPolicy is null");
        }
    }
}
