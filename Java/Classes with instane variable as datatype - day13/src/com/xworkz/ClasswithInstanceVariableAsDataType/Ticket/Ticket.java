package com.xworkz.ClasswithInstanceVariableAsDataType.Ticket;

public class Ticket {
    public void type() {
        TicketType[] ticketTypes = TicketType.values();
        for (TicketType ref : ticketTypes) {
            System.out.println(ref);
        }
    }

        void cost() {
        System.out.println("here cost is running");
    }

    void buy() {
        System.out.println("here buy is running");
    }

    void sell() {
        System.out.println("here sell is running");
    }
}

