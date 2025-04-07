package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Cricket;
import com.xworkz.IsARelation.internal.OutdoorGame;

public class OutdoorGameUtil {


        public OutdoorGameUtil() {
            System.out.println("OutdoorGameUtil constructor is running");
        }

        public void getOutdoorGame(OutdoorGame game) {
            if (game != null) {
                game.setUpField();
                game.startGame();
                game.endGame();
                game.countPlayers();
                game.checkWeather();

                if (game instanceof Cricket) {
                    Cricket cricket = (Cricket) game;
                    cricket.toss();
                } else {
                    System.out.println("game is not an instance of Cricket");
                }
            }
        }


}
