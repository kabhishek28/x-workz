package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Dasara;
import com.xworkz.IsARelation.internal.Festival;

public class DasaraRunner {
    public static void main(String[] args) {
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
