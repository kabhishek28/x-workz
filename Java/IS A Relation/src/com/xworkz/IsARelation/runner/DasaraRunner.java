package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Dasara;
import com.xworkz.IsARelation.internal.Festival;

public class DasaraRunner {
    public static void main(String[] args) {
        Festival festival1 = new Festival();
        festival1.date();
        festival1.name();
        festival1.sweet();
        System.out.println("-----------");
        Dasara dasara = new Dasara();
        dasara.date();
        dasara.name();
        dasara.sweet();
        System.out.println("-----------");
        Festival festival = new Dasara();
        festival.date();
        festival.name();
        festival.sweet();
    }
}
