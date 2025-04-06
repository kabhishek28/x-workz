package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Amongus;
import com.xworkz.IsARelation.internal.Game;

public class AmongusRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.restart();
        game.showScore();
        game.end();
        game.pause();
        System.out.println("----------");
        Game game1 = new Amongus();
        game1.start();
        game1.restart();
        game1.showScore();
        game1.end();
        game1.pause();
        System.out.println("--------------");
        Amongus amongus = new Amongus();
        amongus.showScore();
        amongus.restart();
        amongus.start();
        amongus.end();
        amongus.pause();

    }
}
