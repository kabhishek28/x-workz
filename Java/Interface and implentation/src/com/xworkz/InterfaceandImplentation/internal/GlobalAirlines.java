package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.AirlineReservation;

public class GlobalAirlines implements AirlineReservation {
    @Override
    public void searchFlights() {
        System.out.println("GlobalAirlines searching for available flights.");
    }

    @Override
    public void bookSeat() {
        System.out.println("GlobalAirlines seat booked successfully.");
    }

    @Override
    public void cancelBooking() {
        System.out.println("GlobalAirlines booking cancelled.");
    }
}