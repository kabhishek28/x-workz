package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Coins;
import com.xworkz.IsARelation.internal.Carrom;

public class CoinsRunner {
    public static void main(String[] args) {
        Carrom carrom1 =new Carrom();
        carrom1.end();
        carrom1.coins();
        carrom1.play();
        carrom1.noOfcoins();
        carrom1.display();
        System.out.println("-----------------------");
        Carrom carrom = new Coins();
        carrom.end();
        carrom.coins();
        carrom.play();
        carrom.noOfcoins();
        carrom.display();
        System.out.println("-----------------------");
        Coins coins = new Coins();
        coins.end();
        coins.coins();
        coins.play();
        coins.noOfcoins();
        coins.display();
    }
}
