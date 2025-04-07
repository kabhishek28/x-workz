package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Bicycle;
import com.xworkz.IsARelation.internal.AutoMobile;

public class Cycle {
    public Cycle(){
        System.out.println("Cycle const");
    }

    public  void getBiCycle(AutoMobile autoMobile){
        if(autoMobile != null){
            autoMobile.start();
            autoMobile.Stop();
            autoMobile.Speed();
            autoMobile.applyBreak();
            autoMobile.topSpeed();
            if(autoMobile instanceof Bicycle)
            {
                Bicycle bicycle = (Bicycle) autoMobile;
                bicycle.gearChange();
            }else {
                System.out.println("automobile is not a instances of Bicycle");
            }
        }else{
            System.out.println("autoMobile is NULL");
        }
    }
}
