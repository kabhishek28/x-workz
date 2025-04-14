package com.xworkz.ToString.internal;

import java.security.cert.X509Certificate;

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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ZooAnimal) {
                ZooAnimal other = (ZooAnimal) object;
                if (this.species.equals(other.species) &&
                        this.name.equals(other.name) &&
                        this.age == other.age) {
                    return true;
                }
            }
        }
        return false;
    }
}


