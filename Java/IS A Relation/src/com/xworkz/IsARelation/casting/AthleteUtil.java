package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Cricketer;
import com.xworkz.IsARelation.internal.Athlete;

public class AthleteUtil {



        public AthleteUtil() {
            System.out.println("AthleteUtil constructor is running");
        }

        public void getAthlete(Athlete athlete) {
            if (athlete != null) {
                athlete.train();
                athlete.compete();
                athlete.followDiet();
                athlete.recover();
                athlete.setGoals();

                if (athlete instanceof Cricketer) {
                    Cricketer cricketer = (Cricketer) athlete;
                    cricketer.scoreCentury();
                } else {
                    System.out.println("athlete is not an instance of Cricketer");
                }
            }
        }


}
