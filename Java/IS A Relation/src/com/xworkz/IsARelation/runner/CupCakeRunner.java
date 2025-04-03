package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.CupCake;

public class CupCakeRunner {
    public static void main(String[] args) {
        CupCake cupCake = new CupCake();
        cupCake.bills();
        cupCake.open();
        cupCake.offer();
        cupCake.close();
    }
}
