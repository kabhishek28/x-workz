package com.xworkz.encapsulation;

public class Specs {
    public void inspect(Lens lens) {
        System.out.println("lens in Specs class");
        if (lens != null) {
            lens.setType("Glass");
            lens.setCost(700);
            System.out.println(lens.getCost());
            System.out.println(lens.getType());
        }
    }
}

