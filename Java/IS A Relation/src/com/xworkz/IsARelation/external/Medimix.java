package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Shampoo;

public class Medimix extends Shampoo {

        public Medimix(){
            System.out.println("no args const of Medimix");
        }

    @Override
    public void apply() {
        System.out.println("@Override :Running apply");
    }
    @Override
    public void rinse() {
        System.out.println("@Override :Running rinse");
    }
    @Override
    public void wash() {
        System.out.println("@Override :Running wash");
    }
    @Override
    public void clean() {
        System.out.println("@Override :Running clean");
    }
    @Override
    public void rub() {
        System.out.println("@Override :Running rub");
    }

}
