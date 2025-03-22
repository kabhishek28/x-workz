package com.xworkz.ClasswithInstanceVariableAsDataType.Cricket;

import com.xworkz.ClasswithInstanceVariableAsDataType.Clip.Clip;
import com.xworkz.ClasswithInstanceVariableAsDataType.Ticket.Cricket;
import com.xworkz.ClasswithInstanceVariableAsDataType.Ticket.Ticket;

public class ViratRunner {
    public static void main(String[] args) {

        Brush brush = new Brush();
        Clip clip = new Clip();
        Ticket ticket = new Ticket();
        Cricket cricket = new Cricket(ticket);

        Virat virat = new Virat(cricket, ticket, brush, clip);

        virat.play();
        virat.clean();
        virat.relax();
    }

}
