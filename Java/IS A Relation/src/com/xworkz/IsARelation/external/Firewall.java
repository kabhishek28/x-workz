package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.CyberSecuritySystem;

public class Firewall extends CyberSecuritySystem {

    public Firewall() {
        System.out.println("No-argument constructor: Firewall");
    }
@Override
    public void scanThreats() {
        System.out.println("@Override :Scanning for cyber threats...");
    }
    @Override
    public void encryptData() {
        System.out.println("@Override :Encrypting sensitive data...");
    }
    @Override
    public void monitorTraffic() {
        System.out.println("@Override :Monitoring network traffic...");
    }
    @Override
    public void preventIntrusion() {
        System.out.println("@Override :Preventing unauthorized intrusion...");
    }
    @Override
    public void generateReports() {
        System.out.println("@Override :Generating security reports...");
    }
}
