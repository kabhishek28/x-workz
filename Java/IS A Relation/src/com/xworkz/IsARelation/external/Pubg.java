package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.BattleRoyaleGame;
import com.xworkz.IsARelation.internal.Game;

public class Pubg extends BattleRoyaleGame {
    public Pubg(){
        System.out.println("zero parameter of const pubg");
    }


@Override
    public void dropFromSky() {
        System.out.println("@Override :Dropping from the sky into the battlefield...");
    }
    @Override
    public void collectWeapons() {
        System.out.println("@Override :Collecting weapons and gear...");
    }
    @Override
    public void eliminateOpponents() {
        System.out.println("@Override :Eliminating opponents...");
    }
    @Override
    public void surviveZone() {
        System.out.println("@Override :Surviving within the safe zone...");
    }
    @Override
    public void winMatch() {
        System.out.println("@Override :Winning the battle royale match!");
    }
}
