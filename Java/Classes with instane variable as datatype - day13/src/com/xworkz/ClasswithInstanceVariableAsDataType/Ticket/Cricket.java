package com.xworkz.ClasswithInstanceVariableAsDataType.Ticket;

import com.xworkz.ClasswithInstanceVariableAsDataType.Cricket.Virat;

public class Cricket {
    Ticket ticket;

    Cricket(){
        super();
    }
    public  Cricket(Ticket ticket){
        this();
        this.ticket=ticket;
    }



//    Cricket(Ticket ticket){
//        this.ticket = ticket;
//    }

    public void setSeatType(){
        if(this.ticket != null) {
            System.out.println("enter the seat type");
            this.ticket.type();
        }else{
          System.out.println("not found");
        }

    }


    public void watch(){
        if(ticket != null) {
            ticket.buy();
        }else{
            System.out.println(" watch null ");
        }
    }

    public void profit(){
        if(ticket != null) {
            ticket.sell();
        }else{
            System.out.println("profit null");
        }
    }

    public void price(){
        if(ticket != null){
            ticket.cost();
        }else{
            System.out.println("price null");
        }

    }

}
