package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.LuxuryYacht;
import com.xworkz.IsARelation.internal.Yacht;

public class YachtServiceHandler {

        public YachtServiceHandler() {
            System.out.println("YachtServiceHandler Constructor");
        }

        public void handleYacht(Yacht yacht) {
            if (yacht != null) {
                yacht.sail();
                yacht.dock();
                yacht.hostParty();
                yacht.navigate();
                yacht.provideLuxuryExperience();

                if (yacht instanceof LuxuryYacht) {
                    LuxuryYacht luxuryYacht = (LuxuryYacht) yacht;
                    luxuryYacht.serveChampagne(); // Subclass-specific method
                } else {
                    System.out.println("The given yacht is not a LuxuryYacht.");
                }
            }
        }


}
