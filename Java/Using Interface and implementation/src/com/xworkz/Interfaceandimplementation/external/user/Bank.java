package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.RBI;

public class Bank {
    private RBI rbi;

    public Bank(RBI rbi) {
        this.rbi = rbi;
    }

    public void getRBI(){
        if(rbi != null){
            rbi.maintainCRR();
        }else {
            System.out.println("RBI is null");
        }
    }
}
