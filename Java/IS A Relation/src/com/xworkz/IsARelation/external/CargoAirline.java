package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Airline;

public class CargoAirline extends Airline {
    public CargoAirline() {
        System.out.println("CargoAirline Constructor");
    }
@Override
    public void scheduleFlights() {
        System.out.println("@Override :Airline is scheduling flights");
    }
    @Override
    public void bookTickets() {
        System.out.println("@Override :Airline is booking tickets");
    }
    @Override
    public void maintainAircraft() {
        System.out.println("@Override :Airline is maintaining aircraft");
    }
    @Override
    public void manageCrew() {
        System.out.println("@Override :Airline is managing crew");
    }
    @Override
    public void handlePassengers() {
        System.out.println("@Override :Airline is handling passengers");
    }
}