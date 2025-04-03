package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.JCB;
import com.xworkz.IsARelation.internal.AutoMobile;

public class JCBRunner {
    public static void main(String[] args) {
        JCB jcb = new JCB();
        jcb.start();
        jcb.Stop();
        jcb.Speed();
        jcb.applyBreak();
        jcb.topSpeed();

        System.out.println("--------------------");

        AutoMobile autoMobile = new JCB();
        autoMobile.start();
        autoMobile.Stop();
        autoMobile.Speed();
        autoMobile.applyBreak();
        autoMobile.topSpeed();
    }
}
