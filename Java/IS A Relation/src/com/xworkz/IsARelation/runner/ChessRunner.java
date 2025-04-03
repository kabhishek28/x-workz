package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Chess;
import com.xworkz.IsARelation.internal.Game;

public class ChessRunner {
    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.start();
        chess.end();
        chess.pause();
        chess.restart();
        chess.showScore();
        System.out.println("----------------");
        Game game = new Chess();
        game.start();
        game.end();
        game.pause();
        game.restart();
        game.showScore();
    }
}
