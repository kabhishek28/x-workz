package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.RCB;
import com.xworkz.IsARelation.internal.IPL;

public class RCBRunner {
    public static void main(String[] args) {
        IPL ipl1 = new IPL();
        ipl1.team();
        ipl1.brand();
        ipl1.player();
        ipl1.sponsor();
        ipl1.cup();
        System.out.println("------------------");
        IPL ipl = new RCB();
        ipl.team();
        ipl.brand();
        ipl.player();
        ipl.sponsor();
        ipl.cup();

        System.out.println("-----------");

        RCB rcb = new RCB();
        rcb.brand();
        rcb.team();
        rcb.player();
        rcb.cup();
        rcb.sponsor();
    }
}
