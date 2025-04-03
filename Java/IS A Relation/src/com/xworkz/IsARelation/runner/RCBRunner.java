package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.RCB;
import com.xworkz.IsARelation.internal.IPL;

public class RCBRunner {
    public static void main(String[] args) {
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
