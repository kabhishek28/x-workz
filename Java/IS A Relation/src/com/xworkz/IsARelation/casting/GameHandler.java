package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Ludo;
import com.xworkz.IsARelation.internal.BoardGame;

public class GameHandler {


        public GameHandler() {
            System.out.println("GameHandler Constructor");
        }

        public void handleGame(BoardGame game) {
            if (game != null) {
                game.setupBoard();
                game.startGame();
                game.rollDice();
                game.movePiece();
                game.endGame();

                if (game instanceof Ludo) {
                    Ludo ludo = (Ludo) game;
                    ludo.playWithFriends();  // Custom method
                } else {
                    System.out.println("The game is not an instance of Ludo.");
                }
            }
        }



}
