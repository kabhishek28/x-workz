package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Amongus;
import com.xworkz.IsARelation.internal.Game;

public class PlayStore {
    public PlayStore(){
        System.out.println("PlayStore Const");
    }

    public void getGame(Game game){
        if(game != null) {
            game.start();
            game.end();
            game.pause();
            game.restart();
            game.showScore();
            if (game instanceof Amongus) {
                Amongus amongus = (Amongus) game;
                amongus.saveProgress();
            } else {
                System.out.println("game is not a instanceof Amongus");
            }
        }else {
            System.out.println("Game is NULL");
        }

    }
}
