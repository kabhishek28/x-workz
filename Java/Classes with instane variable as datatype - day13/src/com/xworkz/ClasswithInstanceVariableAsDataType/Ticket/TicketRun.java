package com.xworkz.ClasswithInstanceVariableAsDataType.Ticket;

public class TicketRun {
    public static void main(String[] args) {
        //TicketType[] ticketType = TicketType.values();
        Ticket ticket = new Ticket();
        Cricket cricket = new Cricket();
        cricket.ticket = ticket;
        cricket.setSeatType();
        cricket.watch();
        cricket.profit();
        cricket.price();

//            ref.cricket.ref.watch();
//            ref.cricket.profit();
//            ref.cricket.price();
        }
    }



