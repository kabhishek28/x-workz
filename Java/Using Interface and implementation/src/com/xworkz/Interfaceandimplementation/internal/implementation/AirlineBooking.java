package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.BaggagePolicy;

public class AirlineBooking implements BaggagePolicy {
    @Override
    public void checkBaggageLimit() {
        System.out.println("Airline checks if baggage is within the allowed weight.");
    }
}