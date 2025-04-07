package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.Firewall;
import com.xworkz.IsARelation.internal.CyberSecuritySystem;

public class CyberUtil {


        public CyberUtil() {
            System.out.println("CyberUtil Constructor");
        }

        public void getCyberSecurityDetails(CyberSecuritySystem system) {
            if (system != null) {
                system.scanThreats();
                system.encryptData();
                system.monitorTraffic();
                system.preventIntrusion();
                system.generateReports();

                if (system instanceof Firewall) {
                    Firewall firewall = (Firewall) system;
                    firewall.blockMaliciousIP();
                } else {
                    System.out.println("system is not an instance of Firewall");
                }

                System.out.println("----- Cyber Security Behavior Displayed -----");
            } else {
                System.out.println("CyberSecuritySystem object is null");
            }
        }


}
