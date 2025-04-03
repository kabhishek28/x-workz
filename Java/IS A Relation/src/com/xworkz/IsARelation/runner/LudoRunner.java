package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Ludo;

public class LudoRunner {
    public static void main(String[] args) {
        Ludo ludo = new Ludo();
        ludo.end();
        ludo.start();
        ludo.restart();
        ludo.showScore();
        ludo.pause();
    }
}
