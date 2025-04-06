package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Amazon;
import com.xworkz.IsARelation.internal.River;

public class AmazonRunner {
    public static void main(String[] args) {
        River river1 = new River();
        river1.flow();
        river1.erodeLand();
        river1.supportLife();
        river1.carrySediments();
        river1.provideWater();
        System.out.println("--------------------");



        River river = new Amazon();
        river.flow();
        river.erodeLand();
        river.supportLife();
        river.carrySediments();
        river.provideWater();

        System.out.println("------------");

        Amazon amazon = new Amazon();
        amazon.flow();
        amazon.erodeLand();
        amazon.supportLife();
        amazon.carrySediments();
        amazon.provideWater();
    }
}
