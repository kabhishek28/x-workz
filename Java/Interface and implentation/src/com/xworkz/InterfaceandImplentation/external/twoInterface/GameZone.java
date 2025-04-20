package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.OnlineGame;
import com.xworkz.InterfaceandImplentation.RulesClass.VideoGameConsole;

public class GameZone implements OnlineGame, VideoGameConsole {
    @Override
    public void startGame() {
        System.out.println("startGame method in two method");
    }

    @Override
    public void updateScore() {
        System.out.println("updateScore method in two method");

    }

    @Override
    public void endGame() {
        System.out.println("endGame method in two method");

    }

    @Override
    public void powerOn() {
        System.out.println("powerOn method in two method");

    }

    @Override
    public void loadGame() {
        System.out.println("loadGame method in two method");

    }

    @Override
    public void powerOff() {
        System.out.println("powerOff method in two method");

    }
}
