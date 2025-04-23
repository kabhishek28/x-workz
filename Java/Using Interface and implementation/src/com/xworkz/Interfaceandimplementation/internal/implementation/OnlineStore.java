package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ConsumerProtection;

public class OnlineStore implements ConsumerProtection {
    @Override
    public void ensureRefundPolicy() {
        System.out.println("Online store ensures refund policy as per consumer rights.");
    }
}