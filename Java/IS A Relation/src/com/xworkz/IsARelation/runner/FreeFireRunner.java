package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.FreeFire;

public class FreeFireRunner {
    public static void main(String[] args) {
        FreeFire freeFire = new FreeFire();
        freeFire.end();
        freeFire.pause();
        freeFire.restart();
        freeFire.showScore();
    }
}
