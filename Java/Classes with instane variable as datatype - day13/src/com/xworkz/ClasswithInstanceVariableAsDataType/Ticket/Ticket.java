package com.xworkz.ClasswithInstanceVariableAsDataType.Ticket;

public class Ticket {
    Ticket ticket;
    public void type() {
        TicketType[] ticketTypes = TicketType.values();
        for (TicketType ref : ticketTypes) {
            System.out.println(ref);
        }
    }


    public void cost() {
        System.out.println("here cost is running");
    }

    public void buy() {
        System.out.println("here buy is running");
    }

    public void sell() {
        System.out.println("here sell is running");
    }
}

