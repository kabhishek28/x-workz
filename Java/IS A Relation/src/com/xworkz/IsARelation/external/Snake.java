package com.xworkz.IsARelation.external;


import com.xworkz.IsARelation.internal.Reptile;

public class Snake extends Reptile {
    public Snake(){
        System.out.println("No-argument constructor: Snake");
    }

    @Override
    public void crawl() {
        System.out.println("@Override :Reptile is crawling...");
    }
    @Override
    public void layEggs() {
        System.out.println("@Override :Reptile is laying eggs...");
    }
    @Override
    public void coldBlooded() {
        System.out.println("@Override :Reptile is cold-blooded...");
    }
    @Override
    public void shedSkin() {
        System.out.println("@Override :Reptile is shedding its skin...");
    }
    @Override
    public void camouflage() {
        System.out.println("@Override :Reptile is camouflaging...");
    }
}
