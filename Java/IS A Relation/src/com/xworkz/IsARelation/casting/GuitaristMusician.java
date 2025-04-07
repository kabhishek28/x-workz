package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Guitarist;
import com.xworkz.IsARelation.internal.Musician;

public class GuitaristMusician {


        public GuitaristMusician() {
            System.out.println("MusicianUtil Constructor");
        }

        public void getMusicianDetails(Musician musician) {
            if (musician != null) {
                musician.playInstrument();
                musician.composeMusic();
                musician.performOnStage();
                musician.practice();
                musician.collaborate();

                if (musician instanceof Guitarist) {
                    Guitarist guitarist = (Guitarist) musician;
                    guitarist.showGuitarBrand();
                } else {
                    System.out.println("musician is not an instance of Guitarist");
                }

                System.out.println("----- Musician Behavior Displayed -----");
            } else {
                System.out.println("Musician object is null");
            }
        }


}
