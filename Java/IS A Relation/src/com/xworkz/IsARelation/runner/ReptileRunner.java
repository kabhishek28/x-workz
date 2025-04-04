package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Snake;
import com.xworkz.IsARelation.internal.Reptile;

public class ReptileRunner {
    public static void main(String[] args) {
        Reptile reptile = new Snake();
        reptile.crawl();
        reptile.layEggs();
        reptile.coldBlooded();
        reptile.shedSkin();
        reptile.camouflage();

        System.out.println("******************");

        Snake snake = new Snake();
        snake.crawl();
        snake.layEggs();
        snake.coldBlooded();
        snake.shedSkin();
        snake.camouflage();
    }
}
