package com.xworkz.staticBlock;

public class LollipopRunner {
    public static void main(String[] args) {
        Lollipop lollipop = new Lollipop();
        Lollipop.brand = "Chupa Chups";
        lollipop.setPrice(50);

        System.out.println(lollipop.brand);
        System.out.println(lollipop.getPrice());
        System.out.println(Lollipop.brand);

        Lollipop lollipop1 = new Lollipop();

        System.out.println(lollipop1.brand);
        System.out.println(lollipop1.getPrice());
        System.out.println(Lollipop.brand);

        lollipop1.brand = "Jolly";
        lollipop1.setPrice(70);

        System.out.println(lollipop1.brand);
        System.out.println(lollipop1.getPrice());
        System.out.println(Lollipop.brand);
    }
}

