package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Firewall;

public class SecureFirewall implements Firewall {
    @Override
    public void blockIntrusion() {
        System.out.println("Blocking unauthorized access attempts.");
    }

    @Override
    public void monitorTraffic() {
        System.out.println("Monitoring network traffic for suspicious activity.");
    }

    @Override
    public void updateRules() {
        System.out.println("Updating firewall rules for enhanced security.");
    }
}