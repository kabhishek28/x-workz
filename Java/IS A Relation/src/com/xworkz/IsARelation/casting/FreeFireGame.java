package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.FreeFire;
import com.xworkz.IsARelation.internal.OnlineGame;

public class FreeFireGame {




        public FreeFireGame() {
            System.out.println("GameUtil Constructor");
        }

        public void getGameDetails(OnlineGame game) {
            if (game != null) {
                game.connectToServer();
                game.createLobby();
                game.startMatch();
                game.chatWithPlayers();
                game.endSession();

                if (game instanceof FreeFire) {
                    FreeFire freeFire = (FreeFire) game;
                    freeFire.useCharacterSkill();
                } else {
                    System.out.println("game is not an instance of FreeFire");
                }

            } else {
                System.out.println("Game object is null");
            }
        }

}



