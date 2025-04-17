package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.MobileNetwork;

public class VerizonNetwork implements MobileNetwork {
    @Override
    public void makeCall() {
        System.out.println("Making a call using Verizon network.");
    }

    @Override
    public void sendSMS() {
        System.out.println("Sending SMS via Verizon network.");
    }

    @Override
    public void connectInternet() {
        System.out.println("Connecting to the internet via Verizon network.");
    }
}