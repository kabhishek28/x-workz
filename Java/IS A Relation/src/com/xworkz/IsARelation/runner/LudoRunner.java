package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Ludo;
import com.xworkz.IsARelation.internal.BoardGame;

public class LudoRunner {
    public static void main(String[] args) {
        BoardGame boardGame = new BoardGame();
        boardGame.startGame();
        boardGame.endGame();
        boardGame.rollDice();
        boardGame.movePiece();
        boardGame.setupBoard();
        System.out.println("-------------");
        BoardGame boardGame1 = new Ludo();
        boardGame1.startGame();
        boardGame1.endGame();
        boardGame1.rollDice();
        boardGame1.movePiece();
        boardGame1.setupBoard();
        System.out.println("-----------------");
        Ludo ludo = new Ludo();
       ludo.startGame();
       ludo.endGame();
       ludo.rollDice();
       ludo.movePiece();
       ludo.setupBoard();
    }
}
