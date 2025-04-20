package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.AccessControl;
import com.xworkz.InterfaceandImplentation.RulesClass.Firewall;

public class SecuritySystem implements AccessControl, Firewall {
    @Override public void grantAccess() { System.out.println("SecuritySystem granting access."); }
    @Override public void revokeAccess() { System.out.println("SecuritySystem revoking access."); }
    @Override public void auditAccess() { System.out.println("SecuritySystem auditing access logs."); }
    @Override public void blockIntrusion() { System.out.println("SecuritySystem blocking intrusion."); }
    @Override public void monitorTraffic() { System.out.println("SecuritySystem monitoring traffic."); }
    @Override public void updateRules() { System.out.println("SecuritySystem updating firewall rules."); }
}
