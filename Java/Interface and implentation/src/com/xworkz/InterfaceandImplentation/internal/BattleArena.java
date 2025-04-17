package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.OnlineGame;

public class BattleArena implements OnlineGame {
    @Override
    public void startGame() {
        System.out.println("Online game BattleArena has started.");
    }

    @Override
    public void updateScore() {
        System.out.println("Updating score in BattleArena.");
    }

    @Override
    public void endGame() {
        System.out.println("Game over in BattleArena.");
    }
}
