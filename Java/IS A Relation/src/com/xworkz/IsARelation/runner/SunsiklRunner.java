package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.internal.Shampoo;

public class SunsiklRunner {

    public static void main(String[] args) {
        Shampoo shampoo=new Shampoo();
        shampoo.apply();
        shampoo.clean();
        shampoo.rub();
        shampoo.rinse();
        shampoo.wash();
    }
}
