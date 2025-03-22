package com.xworkz.ClasswithInstanceVariableAsDataType.Ticket;

public class Cricket {
    Ticket ticket;

//    Cricket(Ticket ticket){
//        this.ticket = ticket;
//    }

    void setSeatType(){
        if(this.ticket != null) {
            System.out.println("enter the seat type");
            this.ticket.type();
        }else{
          System.out.println("not found");
        }

    }


    void watch(){
        if(ticket != null) {
            ticket.buy();
        }else{
            System.out.println("null");
        }
    }

    void profit(){
        if(ticket != null) {
            ticket.sell();
        }else{
            System.out.println("null");
        }
    }

    void price(){
        if(ticket != null){
            ticket.cost();
        }else{
            System.out.println("null");
        }

    }

}
