package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Sparrow;
import com.xworkz.IsARelation.internal.Bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird1 = new Bird();

        bird1.fly();
        bird1.sing();
        bird1.eat();
        bird1.sleep();
        bird1.nest();

        System.out.println("******************");
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
