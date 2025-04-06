package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Instrument;

public class Piano extends Instrument {
        public Piano() {
            System.out.println("Piano Constructor");
        }

@Override
    public void play() {
        System.out.println("@Override :Instrument is being played");
    }
    @Override
    public void tune() {
        System.out.println("@Override :Instrument is being tuned");
    }
    @Override
    public void repair() {
        System.out.println("@Override :Instrument is being repaired");
    }
    @Override
    public void transport() {
        System.out.println("@Override :Instrument is being transported");
    }
    @Override
    public void store() {
        System.out.println("@Override :Instrument is being stored");
    }

}
