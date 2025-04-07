package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Currency;

public class INR extends Currency {
    public INR(){
        System.out.println("no parameter");
    }

@Override
    public void currency(){
        System.out.println("@Override :currency ");
    }
    @Override
    public void rate(){
        System.out.println("@Override :rate Currency");
    }
    @Override
    public void convert(){
        System.out.println("@Override :Convert Currency");
    }
    @Override
    public void GDP(){
        System.out.println("@Override :GDP currency");
    }
    @Override
    public void amount() {
        System.out.println("@Override :amount Currency");
    }

    public void showCurrencySymbol() {
        System.out.println("INR symbol is ₹");
    }

}
