package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Dasara;
import com.xworkz.IsARelation.internal.Festival;

public class FestivalUtil {

        public FestivalUtil() {
            System.out.println("FestivalUtil Constructor");
        }

        public void showFestivalDetails(Festival festival) {
            if (festival != null) {
                festival.name();
                festival.date();
                festival.sweet();

                if (festival instanceof Dasara) {
                    Dasara dasara = (Dasara) festival;
                    dasara.stateCelebrated();
                }
            } else {
                System.out.println("Festival object is null");
            }
        }


}
