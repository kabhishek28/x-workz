package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.River;

public class Amazon extends River {

    public Amazon() {
        System.out.println("Amazon Constructor");
    }
    @Override
    public void flow() {
        System.out.println("@Override :River is flowing");
    }
    @Override
    public void erodeLand() {
        System.out.println("@Override :River is eroding land");
    }
    @Override
    public void supportLife() {
        System.out.println("@Override :River supports aquatic life");
    }
    @Override
    public void carrySediments() {
        System.out.println("@Override :River carries sediments");
    }
    @Override
    public void provideWater() {
        System.out.println("@Override :River provides water for irrigation and drinking");
    }


    public void haveFish(){
        System.out.println("River have fish  ");
    }

}