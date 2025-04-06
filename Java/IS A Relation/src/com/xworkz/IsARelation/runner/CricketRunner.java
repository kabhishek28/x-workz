package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cricket;
import com.xworkz.IsARelation.internal.OutdoorGame;

public class CricketRunner {
    public static void  main(String[] args) {
        OutdoorGame outdoorGame = new OutdoorGame();
        outdoorGame.setUpField();
        outdoorGame.startGame();
        outdoorGame.checkWeather();
        outdoorGame.countPlayers();
        outdoorGame.endGame();
        System.out.println("---------------------");
        Cricket cricket = new Cricket();
        cricket.setUpField();
        cricket.startGame();
        cricket.checkWeather();
        cricket.countPlayers();
        cricket.endGame();
        System.out.println("----------------------");
        Cricket cricket1 = new Cricket();
        cricket1.setUpField();
        cricket1.startGame();
        cricket1.checkWeather();
        cricket1.countPlayers();
        cricket1.endGame();



    }
}
