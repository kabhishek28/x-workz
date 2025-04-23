package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.PackagingStandards;

public class SwiggyPackagingImpl {
    private PackagingStandards standards;

    public SwiggyPackagingImpl(PackagingStandards standards) {
        this.standards = standards;
    }

    public void inspectPackaging() {
        if (standards != null) {
            standards.sealPackage();
        } else {
            System.out.println("PackagingStandards is null");
        }
    }
}

