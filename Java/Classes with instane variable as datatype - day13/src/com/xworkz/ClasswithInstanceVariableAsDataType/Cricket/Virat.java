package com.xworkz.ClasswithInstanceVariableAsDataType.Cricket;

import com.xworkz.ClasswithInstanceVariableAsDataType.Clip.Clip;
import com.xworkz.ClasswithInstanceVariableAsDataType.Ticket.Cricket;
import com.xworkz.ClasswithInstanceVariableAsDataType.Ticket.Ticket;

public class Virat {
    Virat virat ;
    Brush brush;
    Clip clip;
    Ticket ticket;

    Cricket cricket;


    Virat(Cricket cricket , Ticket ticket,Brush brush,Clip clip){
        this.cricket = cricket;
        this.ticket = ticket;
        this.brush = brush;
        this.clip = clip;
    }



    void play(){
        if(cricket != null){
            //cricket.setSeatType();
            cricket.watch();
            cricket.profit();
            cricket.price();

        }else{
            System.out.println(" play null");
        }
    }



    void clean(){
        if(brush != null){
            brush.clean();
            brush.scrub();
        }else{
            System.out.println("brush is null");
        }
    }


    void relax(){
        if(ticket != null){
            ticket.cost();
            ticket.buy();
            ticket.sell();
        }else{
            System.out.println("null");
        }



    }



}
