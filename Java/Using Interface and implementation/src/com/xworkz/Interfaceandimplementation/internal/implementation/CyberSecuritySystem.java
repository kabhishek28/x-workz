package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.FirewallPolicy;

public class CyberSecuritySystem implements FirewallPolicy {
    @Override
    public void blockIntrusion() {
        System.out.println("Cybersecurity system blocks unauthorized intrusions.");
    }
}
