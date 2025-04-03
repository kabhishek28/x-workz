package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.MotherBorad;
import com.xworkz.IsARelation.internal.Borad;

public class MotherBoradRunner {
    public static void main(String[] args) {
        Borad borad = new MotherBorad();
        borad.configure();
        borad.noOFItem();
        borad.current();
        borad.voltage();
        borad.size();

        System.out.println("-******************");

        MotherBorad motherBorad = new MotherBorad();
        motherBorad.configure();
        motherBorad.current();
        motherBorad.size();
        motherBorad.voltage();
        motherBorad.noOFItem();
    }
}
