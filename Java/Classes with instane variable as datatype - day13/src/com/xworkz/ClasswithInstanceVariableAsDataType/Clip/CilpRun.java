package com.xworkz.ClasswithInstanceVariableAsDataType.Clip;

class ClipRun {
    public static void main(String[] args) {
        Clip clip1 = new Clip();
        clip1.color = "Red";


        Clip clip2 = new Clip();
        clip2.color = "yellow";

        Clip clip3 = new Clip();
        clip3.color = "blue";

        Clip clip4 = new Clip();
        clip4.color = "black";

        Clip clip5 = new Clip();
        clip5.color = "white";

        Clip[] clips = {clip1,clip2,clip3,clip4,clip5};
        Pushpa pushpa = new Pushpa();
        pushpa.clip = clips;
        pushpa.useClip();






    }
}






