package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.BulletTrain;
import com.xworkz.IsARelation.internal.Train;

public class BulletTrainStation {

    public BulletTrainStation(){
        System.out.println("BulletTrainStation is const");

    }

    public void getBulletTrain(Train train){
        if(train != null){
            train.startJourney();
            train.stopAtStation();
            train.blowHorn();
            train.increaseSpeed();
            train.providePassengerService();
            if(train instanceof BulletTrain){
                BulletTrain bulletTrain = (BulletTrain) train;
                bulletTrain.applyBreak();
            }else {
                System.out.println("Train is not a instances of Bullet train");
            }

        }else{
            System.out.println("Train is NULL");
        }

    }
}
