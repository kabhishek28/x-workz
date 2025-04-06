package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.BulletTrain;
import com.xworkz.IsARelation.internal.Train;

public class BulletTrainRunner {
    public static void main(String[] args) {

        Train train1 = new Train();
        train1.startJourney();
        train1.increaseSpeed();
        train1.blowHorn();
        train1.providePassengerService();
        train1.stopAtStation();
        System.out.println("--------------");
        Train train = new BulletTrain();
        train.startJourney();
        train.increaseSpeed();
        train.blowHorn();
        train.providePassengerService();
        train.stopAtStation();

        System.out.println("---------------");

        BulletTrain bulletTrain = new BulletTrain();
        bulletTrain.startJourney();
        bulletTrain.increaseSpeed();
        bulletTrain.blowHorn();
        bulletTrain.providePassengerService();
        bulletTrain.stopAtStation();

    }
}
