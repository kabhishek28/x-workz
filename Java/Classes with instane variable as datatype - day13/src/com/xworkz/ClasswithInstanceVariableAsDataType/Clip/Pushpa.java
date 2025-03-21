package com.xworkz.ClasswithInstanceVariableAsDataType.Clip;

public class Pushpa {
    Clip[] clip ;

    void useClip()
    {
        if(clip != null){
//            for(Clip ref:clip){
//                ref.hold();
//                ref.display();
//            }
            for(int i =0;i<clip.length;i++){
                clip[i].hold();
                clip[i].display();
            }
        }else{
            System.out.println("clip not initlized");
        }

    }


}
