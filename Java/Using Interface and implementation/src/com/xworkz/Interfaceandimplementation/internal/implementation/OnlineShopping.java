package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.RefundPolicy;

public class OnlineShopping  implements RefundPolicy {
    @Override
    public void processRefund() {
        System.out.println("Online store processes refund as per the return policy.");
    }
}
