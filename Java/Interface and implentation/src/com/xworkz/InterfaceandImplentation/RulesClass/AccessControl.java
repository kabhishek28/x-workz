package com.xworkz.InterfaceandImplentation.RulesClass;

public interface AccessControl {
    void grantAccess();
    void revokeAccess();
    void auditAccess();
    default void puseAccess(){
        System.out.println("puseAccess in AccessControl");
    }
}
