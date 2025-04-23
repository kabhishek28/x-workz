package com.xworkz.Interfaceandimplementation.external.user;


import com.xworkz.Interfaceandimplementation.internal.rules.ConsumerProtection;

public class AmazonConsumerProtectionImpl {
    private ConsumerProtection consumerProtection;

    public AmazonConsumerProtectionImpl(ConsumerProtection consumerProtection) {
        this.consumerProtection = consumerProtection;
    }

    public void checkPolicy() {
        if (consumerProtection != null) {
            consumerProtection.ensureRefundPolicy();
        } else {
            System.out.println("ConsumerProtection is null");
        }
    }
}