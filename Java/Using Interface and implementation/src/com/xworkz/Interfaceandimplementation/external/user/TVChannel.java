package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.TRAI;

public class TVChannel {
    private TRAI trai;

    public TVChannel(TRAI trai) {
        this.trai = trai;
    }

    public void getTV(){
        if(trai != null){
            trai.regulateContent();
        }else{
            System.out.println("trai is null");
        }
    }
}
