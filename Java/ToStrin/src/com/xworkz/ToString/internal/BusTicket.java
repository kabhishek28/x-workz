package com.xworkz.ToString.internal;

public class BusTicket {

        private String source;
        private String destination;
        private int fare;

        public BusTicket(String source, String destination, int fare) {
            this.source = source;
            this.destination = destination;
            this.fare = fare;
        }

        @Override
        public String toString() {
            return "From: " + source + " To: " + destination + "Fare: "+fare;

        }
}
