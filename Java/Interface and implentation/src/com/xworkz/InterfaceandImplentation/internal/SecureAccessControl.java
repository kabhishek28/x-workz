package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.AccessControl;

public class SecureAccessControl implements AccessControl {
    @Override
    public void grantAccess() {
        System.out.println("Access granted to the secure area.");
    }

    @Override
    public void revokeAccess() {
        System.out.println("Access revoked from the secure area.");
    }

    @Override
    public void auditAccess() {
        System.out.println("Auditing access logs.");
    }
}