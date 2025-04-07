package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Coins;
import com.xworkz.IsARelation.internal.Carrom;

public class CarromUtil {

        public CarromUtil() {
            System.out.println("CarromUtil constructor is running");
        }

        public void getCarrom(Carrom carrom) {
            if (carrom != null) {
                carrom.coins();
                carrom.noOfcoins();
                carrom.play();
                carrom.end();
                carrom.display();

                if (carrom instanceof Coins) {
                    Coins coins = (Coins) carrom;
                    coins.strikeCoin();
                } else {
                    System.out.println("carrom is not an instance of Coins");
                }
            }
        }


}
