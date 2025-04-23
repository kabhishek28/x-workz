package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.CancellationPolicy;

public class HotelBookingSystem implements CancellationPolicy {
    @Override
    public void handleCancellation() {
        System.out.println("Hotel booking system processes cancellation requests.");
    }
}