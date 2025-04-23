package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.CopyrightRules;

public class NetflixCopyrightImpl {
    private CopyrightRules copyrightRules;

    public NetflixCopyrightImpl(CopyrightRules copyrightRules) {
        this.copyrightRules = copyrightRules;
    }

    public void checkContentLicense() {
        if (copyrightRules != null) {
            copyrightRules.verifyLicense();
        } else {
            System.out.println("CopyrightRules is null");
        }
    }
}
