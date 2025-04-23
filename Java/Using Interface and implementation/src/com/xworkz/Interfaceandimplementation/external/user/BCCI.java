package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ICC;

public class BCCI {
    private ICC icc ;

    public BCCI(ICC icc) {
        this.icc = icc;
    }

    public void getRules( ){
        if(icc != null){
            icc.setRules();
        }else{
            System.out.println("icc is null");
        }
    }
}
