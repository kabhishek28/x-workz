package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Guitar;
import com.xworkz.IsARelation.internal.MusicalInstrument;

public class InstrumentUtil {

        public InstrumentUtil() {
            System.out.println("InstrumentUtil Constructor");
        }

        public void getInstrumentDetails(MusicalInstrument instrument) {
            if (instrument != null) {
                instrument.play();
                instrument.tune();
                instrument.maintain();
                instrument.transport();
                instrument.store();

                if (instrument instanceof Guitar) {
                    Guitar guitar = (Guitar) instrument;
                    guitar.showGuitarType();
                } else {
                    System.out.println("instrument is not an instance of Guitar");
                }

                System.out.println("----- Instrument Behavior Displayed -----");
            } else {
                System.out.println("Instrument object is null");
            }
        }


}
