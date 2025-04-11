package com.xworkz.ToString.internal;

public class ZooAnimal {
    private String species;
    private String name;
    private int age;

    public ZooAnimal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal: " + name + " (" + species + "), Age: " + age;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}


