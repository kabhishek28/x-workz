package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Dog;
import com.xworkz.IsARelation.internal.Animal;

public class AnimalUtil {


        public AnimalUtil() {
            System.out.println("AnimalUtil Constructor");
        }

        public void showAnimalBehavior(Animal animal) {
            if (animal != null) {
                animal.running();
                animal.name();
                animal.walk();
                animal.fly();
                animal.sleep();
                if(animal instanceof Dog) {
                    Dog dog = (Dog) animal;
                    dog.bark();
                }else {
                    System.out.println("animal is a not a instances of Dog");
                }
        }else{
                System.out.println("animal is NULL");
        }
    }
}
