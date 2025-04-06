package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Snake;
import com.xworkz.IsARelation.internal.Reptile;

public class ReptileRunner {
    public static void main(String[] args) {
        Reptile reptile1 = new Reptile();
        reptile1.crawl();
        reptile1.layEggs();
        reptile1.coldBlooded();
        reptile1.shedSkin();
        reptile1.camouflage();

        System.out.println("******************");
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
