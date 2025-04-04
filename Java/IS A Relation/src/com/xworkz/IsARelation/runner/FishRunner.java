package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Shark;
import com.xworkz.IsARelation.internal.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish = new Shark();
        fish.swim();
        fish.breatheUnderwater();
        fish.layEggs();
        fish.detectVibrations();
        fish.changeDepth();

        System.out.println("******************");

        Shark shark = new Shark();
        shark.swim();
        shark.breatheUnderwater();
        shark.layEggs();
        shark.detectVibrations();
        shark.changeDepth();
    }
}
