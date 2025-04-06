package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Pubg;
import com.xworkz.IsARelation.internal.BattleRoyaleGame;

public class PubgRunner {
    public static void main(String[] args) {
        BattleRoyaleGame battleRoyaleGame = new BattleRoyaleGame();
        battleRoyaleGame.collectWeapons();
        battleRoyaleGame.dropFromSky();
        battleRoyaleGame.eliminateOpponents();
        battleRoyaleGame.winMatch();
        battleRoyaleGame.surviveZone();
        System.out.println("-----------");
        BattleRoyaleGame battleRoyaleGame1 = new Pubg();
        battleRoyaleGame1.collectWeapons();
        battleRoyaleGame1.dropFromSky();
        battleRoyaleGame1.eliminateOpponents();
        battleRoyaleGame1.winMatch();
        battleRoyaleGame1.surviveZone();
        System.out.println("-----------");
        Pubg pubg = new Pubg();
        pubg.collectWeapons();
        pubg.dropFromSky();
        pubg.eliminateOpponents();
        pubg.winMatch();
        pubg.surviveZone();

    }
}
