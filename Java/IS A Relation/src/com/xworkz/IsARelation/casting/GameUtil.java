package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Chess;
import com.xworkz.IsARelation.internal.Game;

public class GameUtil {


        public GameUtil() {
            System.out.println("GameUtil constructor is running");
        }

        public void getGame(Game game) {
            if (game != null) {
                game.start();
                game.pause();
                game.restart();
                game.showScore();
                game.end();

                if (game instanceof Chess) {
                    Chess chess = (Chess) game;
                    chess.showStrategy();
                } else {
                    System.out.println("game is not an instance of Chess");
                }
            }
        }



}
