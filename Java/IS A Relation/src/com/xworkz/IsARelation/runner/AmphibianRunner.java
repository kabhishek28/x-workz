package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Frog;
import com.xworkz.IsARelation.internal.Amphibian;

public class AmphibianRunner {
    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.swim();
        amphibian.jump();
        amphibian.breatheThroughSkin();
        amphibian.layEggsInWater();
        amphibian.transitionToLand();

        System.out.println("******************");

        Frog frog = new Frog();
        frog.swim();
        frog.jump();
        frog.breatheThroughSkin();
        frog.layEggsInWater();
        frog.transitionToLand();
    }
}
