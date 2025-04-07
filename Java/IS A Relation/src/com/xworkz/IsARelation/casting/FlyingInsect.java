package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.BulletTrain;
import com.xworkz.IsARelation.external.Butterfly;
import com.xworkz.IsARelation.internal.Insect;

public class FlyingInsect {
    public FlyingInsect(){
        System.out.println("FlyingInsect const");
    }

    public void getButterFly(Insect insect){
        if(insect != null){
            insect.fly();
            insect.metamorphosis();
            insect.feedOnNectar();
            insect.detectVibrations();
            insect.communicateWithPheromones();

            if(insect instanceof Butterfly){
                Butterfly butterfly = (Butterfly) insect;
                butterfly.eat();
            }else{
                System.out.println("insect is not a instances of Butterfly\"");
            }
        }else {
            System.out.println("insect is NULL");
        }
    }
}
