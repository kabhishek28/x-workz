package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Physicist;
import com.xworkz.IsARelation.internal.Scientist;

public class ScientistRunner {
    public static void main(String[] args) {
        Scientist scientist = new Physicist();
        scientist.research();
        scientist.experiment();
        scientist.publish();
        scientist.analyzeData();
        scientist.collaborate();
        System.out.println("---------------------");

        Physicist physicist = new Physicist();
        physicist.analyzeData();
        physicist.research();
        physicist.experiment();
        physicist.publish();
        physicist.collaborate();
    }

}
