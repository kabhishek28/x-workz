package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Cricket;

public class CricketRunner {
    public static void  main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.start();
        cricket.restart();
        cricket.showScore();
        cricket.end();


    }
}
