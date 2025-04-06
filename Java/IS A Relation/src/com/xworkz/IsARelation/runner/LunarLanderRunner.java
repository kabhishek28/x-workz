package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.LunarLander;
import com.xworkz.IsARelation.internal.Spacecraft;



public class LunarLanderRunner {
    public static void main(String[] args) {

        Spacecraft spacecraft1 = new Spacecraft();
        spacecraft1.launch();
        spacecraft1.communicate();
        spacecraft1.land();
        spacecraft1.fuelType();
        spacecraft1.orbit();

        System.out.println("-----------------");
        Spacecraft spacecraft = new LunarLander();
        spacecraft.launch();
        spacecraft.communicate();
        spacecraft.land();
        spacecraft.fuelType();
        spacecraft.orbit();

        System.out.println("-----------------");

        LunarLander lunarLander = new LunarLander();
        lunarLander.launch();
        lunarLander.communicate();
        lunarLander.land();
        lunarLander.fuelType();
        lunarLander.orbit();
    }
}
