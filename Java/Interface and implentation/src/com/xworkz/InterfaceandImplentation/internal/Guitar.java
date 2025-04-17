package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing.");
    }
@Override
    public void tune() {
        System.out.println("Tuning the guitar.");
    }
@Override
    public void stop() {
        System.out.println("Stopped playing guitar.");
    }
}
