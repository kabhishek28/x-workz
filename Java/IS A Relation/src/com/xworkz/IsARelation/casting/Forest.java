package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Amazon;
import com.xworkz.IsARelation.internal.River;

public class Forest {
    public Forest(){
        System.out.println("Forest Constructor");
    }

    public void forestName(River river){
        river.flow();
        river.erodeLand();
        river.supportLife();
        river.carrySediments();
        river.provideWater();
        if(river instanceof Amazon){
            Amazon amazon = (Amazon) river;
            amazon.haveFish();
        }
        else {
            System.out.println("river is not instances of Amazon");
        }
    }
}
