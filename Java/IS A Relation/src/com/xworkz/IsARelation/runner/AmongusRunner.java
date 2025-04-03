package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Amongus;
import com.xworkz.IsARelation.internal.Game;

public class AmongusRunner {
    public static void main(String[] args) {
        Amongus amongus = new Amongus();
        amongus.start();
        amongus.restart();
        amongus.showScore();
        Game game = new Amongus();
        game.showScore();
        game.restart();

    }
}
