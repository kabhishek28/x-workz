package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Piano;
import com.xworkz.IsARelation.internal.Instrument;

public class PianoRunner {
    public static void main(String[] args) {
        Instrument instrument1 = new Instrument();
        instrument1.play();
        instrument1.tune();
        instrument1.repair();
        instrument1.transport();
        instrument1.store();

        System.out.println("-------------------");
        Instrument instrument = new Piano();
        instrument.play();
        instrument.tune();
        instrument.repair();
        instrument.transport();
        instrument.store();

        System.out.println("-------------------");

        Piano piano = new Piano();
        piano.play();
        piano.tune();
        piano.repair();
        piano.transport();
        piano.store();
    }
}
