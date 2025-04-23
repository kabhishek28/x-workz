package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.RentalPolicy;

public class VehicleRental implements RentalPolicy {
    @Override
    public void checkAvailability() {
        System.out.println("Vehicle rental system checks vehicle availability.");
    }
}