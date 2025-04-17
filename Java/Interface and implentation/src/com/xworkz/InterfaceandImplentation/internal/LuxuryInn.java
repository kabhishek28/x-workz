package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Hotel;

public class LuxuryInn implements Hotel {
    @Override
    public void bookRoom() {
        System.out.println("Room booked at Luxury Inn.");
    }
@Override
    public void checkIn() {
        System.out.println("Guest checked in.");
    }
@Override
    public void checkOut() {
        System.out.println("Guest checked out.");
    }
}
