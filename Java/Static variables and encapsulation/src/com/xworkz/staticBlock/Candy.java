package com.xworkz.staticBlock;

public class Candy {
    public static final String flavor;

    public Candy() {
        System.out.println("No arg constructor");
    }

    static {
        flavor = "Strawberry";
        System.out.println("static block");
    }
}

