package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Guitarist;
import com.xworkz.IsARelation.internal.Musician;

public class MusicianRunner {
    public static void main(String[] args) {

        Musician musician1 = new Musician();
        musician1.playInstrument();
        musician1.composeMusic();
        musician1.performOnStage();
        musician1.practice();
        musician1.collaborate();

        System.out.println("******************");
        Musician musician = new Guitarist();
        musician.playInstrument();
        musician.composeMusic();
        musician.performOnStage();
        musician.practice();
        musician.collaborate();

        System.out.println("******************");

        Guitarist guitarist = new Guitarist();
        guitarist.playInstrument();
        guitarist.composeMusic();
        guitarist.performOnStage();
        guitarist.practice();
        guitarist.collaborate();
    }
}
