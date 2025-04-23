package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.UGC;

public class University {
    private UGC ugc;

    public University(UGC ugc) {
        this.ugc = ugc;
    }
    public void getUGC(){
        if(ugc != null){
            ugc.conductExams();
        }else{
            System.out.println("UGC is null");
        }
    }
}
