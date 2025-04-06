package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.LuxuryYacht;
import com.xworkz.IsARelation.internal.Yacht;

public class LuxuryYachtRunner {
    public static void main(String[] args) {
        Yacht yacht1 = new Yacht();
        yacht1.sail();
        yacht1.navigate();
        yacht1.hostParty();
        yacht1.provideLuxuryExperience();
        yacht1.dock();
        System.out.println("-----------------");
        Yacht yacht = new LuxuryYacht();
        yacht.sail();
        yacht.navigate();
        yacht.hostParty();
        yacht.provideLuxuryExperience();
        yacht.dock();
        System.out.println("-----------------");
        LuxuryYacht luxuryYacht = new LuxuryYacht();
        luxuryYacht.sail();
        luxuryYacht.navigate();
        luxuryYacht.hostParty();
        luxuryYacht.provideLuxuryExperience();
        luxuryYacht.dock();
    }
}
