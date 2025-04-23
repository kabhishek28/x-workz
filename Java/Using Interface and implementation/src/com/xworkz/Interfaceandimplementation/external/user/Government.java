package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.Consitution;

public class Government {
    private Consitution consitution;

    public Government(Consitution consitution) {
        this.consitution = consitution;
    }

    public void getConsitution(){
        if(consitution != null){
            consitution.followLaws();
        }else{
            System.out.println("Consitution is null");
        }
    }
}
