package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.FirewallPolicy;

public class NortonFirewallImpl {
    private FirewallPolicy firewallPolicy;

    public NortonFirewallImpl(FirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    public void protectSystem() {
        if (firewallPolicy != null) {
            firewallPolicy.blockIntrusion();
        } else {
            System.out.println("FirewallPolicy is null");
        }
    }
}
