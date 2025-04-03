package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Amongus;

public class AmongusRunner {
    public static void main(String[] args) {
        Amongus amongus = new Amongus();
        amongus.start();
        amongus.restart();
        amongus.showScore();
    }
}
