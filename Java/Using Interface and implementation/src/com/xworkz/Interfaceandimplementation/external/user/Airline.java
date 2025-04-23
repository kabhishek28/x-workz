package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DGCA;

public class Airline {
    private DGCA dgca;

    public Airline(DGCA dgca) {
        this.dgca = dgca;
    }


    public void getDGCA(){
        if(dgca != null){
            dgca.followFlightRules();
        }else{
            System.out.println("DGCA is null");
        }
    }
}
