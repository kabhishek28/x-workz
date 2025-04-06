package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Firewall;
import com.xworkz.IsARelation.internal.CyberSecuritySystem;

public class CyberSecurityRunner {
    public static void main(String[] args) {

        CyberSecuritySystem securitySystem = new CyberSecuritySystem();
        securitySystem.scanThreats();
        securitySystem.encryptData();
        securitySystem.monitorTraffic();
        securitySystem.preventIntrusion();
        securitySystem.generateReports();

        System.out.println("******************");
        CyberSecuritySystem security = new Firewall();
        security.scanThreats();
        security.encryptData();
        security.monitorTraffic();
        security.preventIntrusion();
        security.generateReports();

        System.out.println("******************");

        Firewall firewall = new Firewall();
        firewall.scanThreats();
        firewall.encryptData();
        firewall.monitorTraffic();
        firewall.preventIntrusion();
        firewall.generateReports();
    }
}
