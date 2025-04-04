package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Sparrow;
import com.xworkz.IsARelation.internal.Bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
        bird.sing();
        bird.eat();
        bird.sleep();
        bird.nest();

        System.out.println("******************");

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sing();
        sparrow.eat();
        sparrow.sleep();
        sparrow.nest();
    }
}
