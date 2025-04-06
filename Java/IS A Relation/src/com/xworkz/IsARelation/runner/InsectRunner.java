package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Butterfly;
import com.xworkz.IsARelation.internal.Insect;

public class InsectRunner {
    public static void main(String[] args) {
        Insect insect1 =new Insect();
        insect1.fly();
        insect1.metamorphosis();
        insect1.feedOnNectar();
        insect1.detectVibrations();
        insect1.communicateWithPheromones();
        System.out.println("------------");
        Insect insect = new Butterfly();
        insect.fly();
        insect.metamorphosis();
        insect.feedOnNectar();
        insect.detectVibrations();
        insect.communicateWithPheromones();

        System.out.println("******************");

        Butterfly butterfly = new Butterfly();
        butterfly.fly();
        butterfly.metamorphosis();
        butterfly.feedOnNectar();
        butterfly.detectVibrations();
        butterfly.communicateWithPheromones();
    }
}
