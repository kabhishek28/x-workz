package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cricketer;
import com.xworkz.IsARelation.internal.Athlete;

public class CricketerRunner {
    public static void main(String[] args) {
        // Using parent class reference to child class object

        Athlete athlete1 =new Athlete();
        athlete1.train();
        athlete1.compete();
        athlete1.followDiet();
        athlete1.recover();
        athlete1.setGoals();

        System.out.println("******************");
        Athlete athlete = new Cricketer();
        athlete.train();
        athlete.compete();
        athlete.followDiet();
        athlete.recover();
        athlete.setGoals();

        System.out.println("******************");

        // Using child class reference
        Cricketer cricketer = new Cricketer();
        cricketer.train();
        cricketer.compete();
        cricketer.followDiet();
        cricketer.recover();
        cricketer.setGoals();
    }
}
