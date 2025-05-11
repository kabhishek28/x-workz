package com.xworkz.ToString.internal;

public class Actor {
    private String name;
    private int age;
    private String bestMovie;

    public Actor(String name, int age, String bestMovie) {
        this.name = name;
        this.age = age;
        this.bestMovie = bestMovie;
    }

    @Override
    public String toString() {
        return "Actor: " + name + ", Age: " + age + ", Best Movie: " + bestMovie;
    }
}

