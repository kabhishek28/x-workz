package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.BoardGame;
import com.xworkz.IsARelation.internal.Game;

public class Ludo extends BoardGame {
    public Ludo(){
        System.out.println("zero argument of the Ludo");
    }



@Override
    public void setupBoard() {
        System.out.println("@Override :Setting up the board...");
    }
    @Override
    public void startGame() {
        System.out.println("@Override :Starting the board game...");
    }
    @Override
    public void rollDice() {
        System.out.println("@Override :Rolling the dice...");
    }
    @Override
    public void movePiece() {
        System.out.println("@Override :Moving a game piece...");
    }
    @Override
    public void endGame() {
        System.out.println("@Override :Ending the board game...");
    }
}
