package com.xworkz.ToString.internal;

import java.util.Objects;

public class EventTicket {
    private String eventName;
    private String seat;
    private double cost;

    public EventTicket(String eventName, String seat, double cost) {
        this.eventName = eventName;
        this.seat = seat;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Event: " + eventName + ", Seat: " + seat + ", Cost: ₹" + cost;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventTicket that)) return false;
        return Double.compare(that.cost, cost) == 0 && Objects.equals(eventName, that.eventName) && Objects.equals(seat, that.seat);
    }
}

    // Runner
