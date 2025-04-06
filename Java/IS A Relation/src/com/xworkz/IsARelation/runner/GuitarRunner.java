package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Guitar;
import com.xworkz.IsARelation.internal.MusicalInstrument;

public class GuitarRunner {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument1 =new MusicalInstrument();
        musicalInstrument1.play();
        musicalInstrument1.maintain();
        musicalInstrument1.store();
        musicalInstrument1.tune();
        musicalInstrument1.transport();
        System.out.println("-------------------");
        Guitar guitar  = new Guitar();
        guitar.play();
        guitar.maintain();
        guitar.store();
        guitar.tune();
        guitar.transport();
        System.out.println("-------------------");
        MusicalInstrument musicalInstrument = new Guitar();
        musicalInstrument.maintain();
        musicalInstrument.play();
        musicalInstrument.store();musicalInstrument.tune();
        musicalInstrument.transport();
    }
}
