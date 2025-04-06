package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Restaurant;

public class SagarHotel extends Restaurant {
    public SagarHotel(){
        System.out.println("no Argu of SagarHotel class");
    }
@Override
    public void room(){
        System.out.println("@Override :Room method is running from the Restaurant class");
    }
    @Override
    public void timing(){
        System.out.println("@Override :Room method is running from the Restaurant class");
    }
    @Override
    public void open(){
        System.out.println("@Override :timing method is running from the Restaurant class");
    }
    @Override
    public void close(){
        System.out.println("@Override :close method is running from the Restaurant class");
    }
    @Override
    public void food(){
        System.out.println("@Override :food method is running from the Restaurant class");
    }
}
