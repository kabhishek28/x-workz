package com.xworkz.ToString.internal;

public class Flight {


        private String airline;
        private String destination;
        private double ticketPrice;

        public Flight(String airline, String destination, double ticketPrice) {
            this.airline = airline;
            this.destination = destination;
            this.ticketPrice = ticketPrice;
        }

        @Override
        public String toString() {
            return "Airline: " + airline + ", Destination: " + destination + ", Price: ₹" + ticketPrice;
        }
    @Override
    public int hashCode(){
        return 4;
    }

}
