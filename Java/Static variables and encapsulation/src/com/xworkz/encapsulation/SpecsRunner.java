package com.xworkz.encapsulation;

public class SpecsRunner {
    public static void main(String[] args) {
        Lens lens = new Lens();
        Specs specs = new Specs();
        specs.inspect(lens);
        System.out.println("*********");
        System.out.println(lens.getType());
        System.out.println(lens.getCost());
    }
}

