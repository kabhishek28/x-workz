package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Planet;

public class Earth extends Planet {
    public Earth() {
        System.out.println("Earth Constructor");
    }
@Override
    public void revolveAroundSun() {
        System.out.println("@Override :Planet is revolving around the Sun");
    }
    @Override
    public void rotateOnAxis() {
        System.out.println("@Override :Planet is rotating on its axis");
    }
    @Override
    public void haveAtmosphere() {
        System.out.println("@Override :Planet has an atmosphere");
    }
    @Override
    public void supportLife() {
        System.out.println("@Override :Some planets support life");
    }
    @Override
    public void haveMoons() {
        System.out.println("@Override :Some planets have moons");
    }

    public void showContinents() {
        System.out.println("Earth has 7 continents: Asia, Africa, North America, South America, Antarctica, Europe, and Australia");
    }

}