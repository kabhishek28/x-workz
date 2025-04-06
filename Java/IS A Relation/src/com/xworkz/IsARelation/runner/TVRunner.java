package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.TVBrand;
import com.xworkz.IsARelation.internal.TV;

public class TVRunner {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.watch();
        tv1.change();
        tv1.off();
        tv1.volume();
        tv1.on();

        System.out.println("-------------------");
        TV tv = new TVBrand();
        tv.watch();
        tv.change();
        tv.off();
        tv.volume();
        tv.on();

        System.out.println("-------------------");

        TVBrand tvBrand = new TVBrand();
        tvBrand.change();
        tvBrand.off();
        tvBrand.watch();
        tvBrand.on();
        tvBrand.volume();
    }
}
