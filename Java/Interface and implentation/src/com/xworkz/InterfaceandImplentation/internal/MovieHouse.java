package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Cinema;

public class MovieHouse implements Cinema {
    @Override
    public void showTimings() {
        System.out.println("Displaying show timings.");
    }
@Override
    public void bookTickets() {
        System.out.println("Tickets booked for movie.");
    }
@Override
    public void cancelTickets() {
        System.out.println("Movie tickets canceled.");
    }
}
