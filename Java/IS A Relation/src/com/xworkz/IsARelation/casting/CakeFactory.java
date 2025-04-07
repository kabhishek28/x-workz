package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Cake;
import com.xworkz.IsARelation.internal.Bakery;

public class CakeFactory {
    public CakeFactory(){
        System.out.println("CakeFactory const");
    }

    public void getCake(Bakery bakery){
        if(bakery != null){
            bakery.order();
            bakery.open();
            bakery.bills();
            bakery.close();
            bakery.offer();
            if(bakery instanceof Cake) {
                Cake cake = (Cake) bakery;
                cake.kg();
            } else{
                System.out.println("bakery is not a insta");
            }

        }else{
            System.out.println("bakery is null");
        }


    }

}
