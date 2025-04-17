package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.SpaService;

public class BlissfulSpa implements SpaService {
    @Override
    public void bookAppointment() {
        System.out.println("Appointment booked at Blissful Spa.");
    }

    @Override
    public void provideService() {
        System.out.println("Providing relaxing spa service.");
    }

    @Override
    public void collectFeedback() {
        System.out.println("Collecting customer feedback at Blissful Spa.");
    }
}