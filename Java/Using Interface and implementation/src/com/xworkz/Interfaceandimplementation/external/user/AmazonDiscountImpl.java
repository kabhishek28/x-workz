package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.DiscountPolicy;

public class AmazonDiscountImpl {
    private DiscountPolicy discountPolicy;

    public AmazonDiscountImpl(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void processDiscount() {
        if (discountPolicy != null) {
            discountPolicy.applyDiscount();
        } else {
            System.out.println("DiscountPolicy is null");
        }
    }
}

