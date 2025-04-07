package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.CargoAirline;
import com.xworkz.IsARelation.internal.Airline;

public class AirlineBooking {
    public AirlineBooking(){
        System.out.println("Airline booking const");
    }

    public void getAirline(Airline airline){
        if(airline != null){
            airline.scheduleFlights();
            airline.bookTickets();
            airline.maintainAircraft();
            airline.manageCrew();
            airline.handlePassengers();
            if(airline instanceof CargoAirline){
                CargoAirline cargoAirline = (CargoAirline) airline;
                cargoAirline.seatAvailable();
            }else{
                System.out.println("airline in not a instances of CargoAirline");
            }
        }
    }
}
