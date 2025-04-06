package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Dog;
import com.xworkz.IsARelation.internal.Animal;

public class DogRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.fly();
        animal1.name();
        animal1.walk();
        animal1.sleep();
        animal1.running();

        System.out.println("------------");
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
