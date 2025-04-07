package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Mountain;

public class Everest extends Mountain {
    public Everest() {
        System.out.println("Everest Constructor");
    }
@Override
    public void rise() {
        System.out.println("@Override :Mountain is rising");
    }
    @Override
    public void erode() {
        System.out.println("@Override :Mountain is eroding");
    }
    @Override
    public void provideHabitat() {
        System.out.println("@Override :Mountain provides habitat for wildlife");
    }
    @Override
    public void regulateClimate() {
        System.out.println("@Override :Mountain helps in climate regulation");
    }
    @Override
    public void storeGlaciers() {
        System.out.println("@Override :Mountain stores glaciers");
    }

    public void showPeakHeight() {
        System.out.println("Mount Everest has a peak height of 8,848 meters above sea level.");
    }

}

