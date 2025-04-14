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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof BusTicket) {
                BusTicket other = (BusTicket) object;
                if (this.fare == other.fare)  {
                    return true;
                }
            }
        }
        return false;
    }
}
