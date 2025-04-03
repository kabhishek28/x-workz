package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Pubg;

public class PubgRunner {
    public static void main(String[] args) {
        Pubg pubg = new Pubg();
        pubg.end();
        pubg.pause();
        pubg.start();
        pubg.restart();
        pubg.showScore();
    }
}
