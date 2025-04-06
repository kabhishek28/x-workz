package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.JCB;
import com.xworkz.IsARelation.internal.AutoMobile;
import com.xworkz.IsARelation.internal.ConstructionMachine;

public class JCBRunner {
    public static void main(String[] args) {
        ConstructionMachine constructionMachine = new ConstructionMachine();
        constructionMachine.loadMaterial();
        constructionMachine.operate();
        constructionMachine.moveToSite();
        constructionMachine.shutDown();
        constructionMachine.performMaintenance();
        System.out.println("----------------------");
        ConstructionMachine constructionMachine1 = new JCB();
        constructionMachine1.loadMaterial();
        constructionMachine1.operate();
        constructionMachine1.moveToSite();
        constructionMachine1.shutDown();
        constructionMachine1.performMaintenance();

        JCB jcb = new JCB();
       jcb.loadMaterial();
       jcb.operate();
       jcb.moveToSite();
       jcb.shutDown();
       jcb.performMaintenance();

    }
}
