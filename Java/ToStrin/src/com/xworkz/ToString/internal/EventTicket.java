package com.xworkz.ToString.internal;

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
}

    // Runner
