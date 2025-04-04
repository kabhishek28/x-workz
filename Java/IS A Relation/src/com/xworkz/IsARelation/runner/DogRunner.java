package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Dog;
import com.xworkz.IsARelation.internal.Animal;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fly();
        dog.name();
        dog.walk();
        dog.sleep();
        dog.running();

        System.out.println("------------");

        Animal animal = new Dog();
        animal.fly();
        animal.name();
        animal.sleep();
        animal.walk();
        animal.running();
    }
}
