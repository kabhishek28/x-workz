package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Game;

public class Amongus extends Game {
    public Amongus(){
        System.out.println("zero argument of the Amongus");
    }
    @Override
    public void start() { System.out.println("@Override :Game started"); }
    @Override
    public void end() { System.out.println("@Override :Game ended"); }
    @Override
    public void pause() { System.out.println("@Override :Game paused"); }
    @Override
    public void restart() { System.out.println("@Override :Game restarted"); }
    @Override
    public void showScore() { System.out.println("@Override :Showing the score"); }

}
