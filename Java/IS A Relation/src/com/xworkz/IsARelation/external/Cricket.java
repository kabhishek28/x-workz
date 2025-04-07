package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Game;
import com.xworkz.IsARelation.internal.OutdoorGame;

public class Cricket extends OutdoorGame {
    public Cricket(){
        System.out.println("no argumets of Cricket");
    }


@Override
    public void setUpField() {
        System.out.println("@Override :Setting up the outdoor game field...");
    }
    @Override

    public void startGame() {
        System.out.println("@Override :Outdoor game is starting...");
    }

    @Override
    public void endGame() {
        System.out.println("@Override :Outdoor game has ended.");
    }

    @Override
    public void countPlayers() {
        System.out.println("@Override :Counting players for the outdoor game...");
    }

    @Override
    public void checkWeather() {
        System.out.println("@Override :Checking weather conditions for the game...");
    }
    public void toss() {
        System.out.println("Cricket toss is happening...");
    }

}
