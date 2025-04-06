package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CargoAirline;
import com.xworkz.IsARelation.internal.Airline;

public class CargoAirlineRunner {
    public static void main(String[] args) {
        Airline airline1 =new Airline();
        airline1.scheduleFlights();
        airline1.bookTickets();
        airline1.maintainAircraft();
        airline1.manageCrew();
        airline1.handlePassengers();
        System.out.println("------------");
        Airline airline = new CargoAirline();
        airline.scheduleFlights();
        airline.bookTickets();
        airline.maintainAircraft();
        airline.manageCrew();
        airline.handlePassengers();

        System.out.println("-------------------");

        CargoAirline cargoAirline = new CargoAirline();
        cargoAirline.scheduleFlights();
        cargoAirline.bookTickets();
        cargoAirline.maintainAircraft();
        cargoAirline.manageCrew();
        cargoAirline.handlePassengers();
    }
}
