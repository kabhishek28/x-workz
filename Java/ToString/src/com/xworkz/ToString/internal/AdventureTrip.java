package com.xworkz.ToString.internal;

public class AdventureTrip {
    private String destination;
    private int durationDays;
    private boolean includesTrekking;

    public AdventureTrip(String destination, int durationDays, boolean includesTrekking) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.includesTrekking = includesTrekking;
    }

    @Override
    public String toString() {
        return "Trip to: " + destination + ", Duration: " + durationDays + " days, Trekking: " + includesTrekking;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object){
        if(object != null){

            if(object instanceof AdventureTrip){
                AdventureTrip adventureTrip = this;
                AdventureTrip adventureTrip1 = (AdventureTrip) object;
                if(adventureTrip.durationDays == adventureTrip1.durationDays){
                    return true;
                }
            }

        }
        return  false;
    }


}
