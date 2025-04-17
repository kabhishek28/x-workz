package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ArcadeMachine;

public class RetroArcade implements ArcadeMachine {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted into the Retro Arcade Machine.");
    }

    @Override
    public void selectGame() {
        System.out.println("Game selected on the Retro Arcade Machine.");
    }

    @Override
    public void startGame() {
        System.out.println("Retro Arcade Machine starting the game.");
    }
}